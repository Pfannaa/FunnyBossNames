package com.funnybossnames;

import javax.inject.Inject;

import com.google.inject.Provides;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.MenuEntry;
import net.runelite.api.NPC;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.util.Text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
@PluginDescriptor(
        name = "Funny Boss Names"
)
public class FunnyBossNamesPlugin extends Plugin {
    @Inject
    private FunnyBossNamesConfig _config;

    @Subscribe
    public void onMenuEntryAdded(MenuEntryAdded event) {
        if (!_config.enableBossNicknames()) {
            return;
        }

        // Only rename actual NPCs, so menu entries of other plugins (e.g. quest helper) stay untouched
        MenuEntry menuEntry = event.getMenuEntry();
        NPC npc = menuEntry.getNpc();
        if (npc == null || npc.getName() == null) {
            return;
        }

        Boss boss = Boss.fromNpcName(Text.removeTags(npc.getName()));
        if (boss == null || !boss.getEnabled().test(_config)) {
            return;
        }

        // Cleared nickname in the settings, keep the real name
        String nickname = boss.getNickname().apply(_config);
        if (nickname == null || nickname.isBlank()) {
            return;
        }

        // Only swap the boss name, so colour tags and combat level stay
        menuEntry.setTarget(menuEntry.getTarget().replaceFirst(
                "(?i)" + Pattern.quote(boss.getNpcName()), Matcher.quoteReplacement(nickname)));
    }

    @Override
    protected void shutDown() {
        log.info("Funny boss names plugin stopped!");
    }

    @Override
    protected void startUp() {
        log.info("Funny boss names plugin started!");
    }

    @Provides
    FunnyBossNamesConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(FunnyBossNamesConfig.class);
    }
}
