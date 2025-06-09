package com.funnybossnames;

import javax.inject.Inject;

import com.google.inject.Provides;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.events.ClientTick;
import net.runelite.api.widgets.Widget;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.api.events.*;

import java.util.Arrays;
import java.util.List;

@Slf4j
@PluginDescriptor(
        name = "Funny Boss Names"
)
public class FunnyBossNamesPlugin extends Plugin {
    @Inject
    private Client _client;

    @Inject
    private FunnyBossNamesConfig _config;

    @Subscribe
    public void onClientTick(ClientTick event) {
        //621 is parent widget collection log
        //Children:
        //CONTAINER = 0;
        //TABS = 3;
        //ENTRY = 17;
        //ENTRY_HEADER = 19;
        //ENTRY_ITEMS = 36;

        Widget bossName = _client.getWidget(303, 9);
        // Commented these out, cause they clashed with other plugins
        //Widget colLogName = client.getWidget(621,12);
        //Widget colLogNameBig = client.getWidget(621,19);
        //Widget colLogNameSmall = client.getWidget(621,19);
        Widget scoreBoardName = _client.getWidget(817, 6);

        if (bossName != null && _config.enableBossNicknames()) {
            String currentBossName = bossName.getText();
            bossName.setText(currentBossName.replace(bossName.getText(), getBossNickname(bossName.getText())));
        }

        if (scoreBoardName != null && _config.enableBossNicknames()) {
            String scoreBoardBossName = scoreBoardName.getText();
            scoreBoardName.setText(scoreBoardBossName.replace(scoreBoardBossName, getBossNickname(scoreBoardBossName)));
        }
    }

    public String getBossNickname(String bossName) {
        if (!_config.enableBossNicknames()) {
            return bossName;
        }

        switch (bossName) {
            case "General Graardor":
                return _config.enableGeneralGraardor() ? _config.generalGraardor() : bossName;
            case "K'ril Tsutsaroth":
                return _config.enableKrilTsutsaroth() ? _config.krilTsutsaroth() : bossName;
            case "Kree'arra":
                return _config.enableKreearra() ? _config.kreearra() : bossName;
            case "Commander Zilyana":
                return _config.enableCommanderZilyana() ? _config.commanderZilyana() : bossName;
            case "Callisto":
                return _config.enableCallisto() ? _config.callisto() : bossName;
            case "Artio":
                return _config.enableArtio() ? _config.artio() : bossName;
            case "Chaos Elemental":
                return _config.enableChaosElemental() ? _config.chaosElemental() : bossName;
            case "Chaos Fanatic":
                return _config.enableChaosFanatic() ? _config.chaosFanatic() : bossName;
            case "Crazy Archaeologist":
                return _config.enableCrazyArchaeologist() ? _config.crazyArchaeologist() : bossName;
            case "King Black Dragon":
                return _config.enableKingBlackDragon() ? _config.kingBlackDragon() : bossName;
            case "Scorpia":
                return _config.enableScorpia() ? _config.scorpia() : bossName;
            case "Venenatis":
                return _config.enableVenenatis() ? _config.venenatis() : bossName;
            case "Spindel":
                return _config.enableSpindel() ? _config.spindel() : bossName;
            case "Vet'ion":
                return _config.enableVetion() ? _config.vetion() : bossName;
            case "Calvar'ion":
                return _config.enableCalvarion() ? _config.calvarion() : bossName;
            case "Dagannoth Prime":
                return _config.enableDagannothPrime() ? _config.dagannothPrime() : bossName;
            case "Dagannoth Rex":
                return _config.enableDagannothRex() ? _config.dagannothRex() : bossName;
            case "Dagannoth Supreme":
                return _config.enableDagannothSupreme() ? _config.dagannothSupreme() : bossName;
            case "Corporeal Beast":
                return _config.enableCorporealBeast() ? _config.corporealBeast() : bossName;
            case "Giant Mole":
                return _config.enableGiantMole() ? _config.giantMole() : bossName;
            case "Deranged Archaeologist":
                return _config.enableDerangedArchaeologist() ? _config.derangedArchaeologist() : bossName;
            case "Cerberus":
                return _config.enableCerberus() ? _config.cerberus() : bossName;
            case "Thermonuclear Smoke Devil":
                return _config.enableThermonuclearSmokeDevil() ? _config.thermonuclearSmokeDevil() : bossName;
            case "Kraken":
                return _config.enableKraken() ? _config.kraken() : bossName;
            case "Kalphite Queen":
                return _config.enableKalphiteQueen() ? _config.kalphiteQueen() : bossName;
            case "Dusk":
                return _config.enableDusk() ? _config.dusk() : bossName;
            case "Dawn":
                return _config.enableDawn() ? _config.dawn() : bossName;
            case "Alchemical Hydra":
                return _config.enableAlchemicalHydra() ? _config.alchemicalHydra() : bossName;
            case "Sarachnis":
                return _config.enableSarachnis() ? _config.sarachnis() : bossName;
            case "Zalcano":
                return _config.enableZalcano() ? _config.zalcano() : bossName;
            case "Phantom Muspah":
                return _config.enablePhantomMuspah() ? _config.phantomMuspah() : bossName;
            case "The Leviathan":
                return _config.enableTheLeviathan() ? _config.theLeviathan() : bossName;
            case "Vardorvis":
                return _config.enableVardorvis() ? _config.vardorvis() : bossName;
            case "Duke Sucellus":
                return _config.enableDukeSuccellus() ? _config.dukeSuccellus() : bossName;
            case "The Whisperer":
                return _config.enableTheWhisperer() ? _config.theWhisperer() : bossName;
            case "Whisperer":
                return _config.enableWhisperer() ? _config.whisperer() : bossName;
            case "Chambers of Xeric":
                return _config.enableChambersOfXeric() ? _config.chambersOfXeric() : bossName;
            case "Theatre of Blood":
                return _config.enableTheatreOfBlood() ? _config.theatreOfBlood() : bossName;
            case "Tombs of Amascut":
                return _config.enableTombsOfAmascut() ? _config.tombsOfAmascut() : bossName;
            case "Abyssal Sire":
                return _config.enableAbyssalSire() ? _config.abyssalSire() : bossName;
            case "Barrows Chests":
                return _config.enableBarrowsChests() ? _config.barrowsChests() : bossName;
            case "Barrows Chest":
                return _config.enableBarrowsChest() ? _config.barrowsChest() : bossName;
            case "Bryophyta":
                return _config.enableBryophyta() ? _config.bryophyta() : bossName;
            case "Dagannoth Kings":
                return _config.enableDagganotheKings() ? _config.dagganotheKings() : bossName;
            case "TzTok-Jad":
                return _config.enableTztokJad() ? _config.tztokJad() : bossName;
            case "The Gauntlet":
                return _config.enableTheGauntlet() ? _config.theGauntlet() : bossName;
            case "Crystalline Hunleff":
                return _config.enableCrystallineHunleff() ? _config.crystallineHunleff() : bossName;
            case "Corrupted Hunleff":
                return _config.enableCorruptedHunleff() ? _config.corruptedHunleff() : bossName;
            case "Grotesque Guardians":
                return _config.enableGrotesqueGuardians() ? _config.grotesqueGuardians() : bossName;
            case "Hespori":
                return _config.enableHespori() ? _config.hespori() : bossName;
            case "The Inferno":
                return _config.enableTheInferno() ? _config.theInferno() : bossName;
            case "Nex":
                return _config.enableNex() ? _config.nex() : bossName;
            case "The Nightmare":
                return _config.enableTheNightmare() ? _config.theNightmare() : bossName;
            case "Phosani's Nightmare":
                return _config.enablePhosanisNightmare() ? _config.phosanisNightmare() : bossName;
            case "Obor":
                return _config.enableObor() ? _config.obor() : bossName;
            case "Skotizo":
                return _config.enableSkotizo() ? _config.skotizo() : bossName;
            case "Tempoross":
                return _config.enableTempoross() ? _config.tempoross() : bossName;
            case "Wintertodt":
                return _config.enableWintertodt() ? _config.wintertodt() : bossName;
            case "Zulrah":
                return _config.enableZulrah() ? _config.zulrah() : bossName;
            case "The Fight Caves":
                return _config.enableTheFightCaves() ? _config.theFightCaves() : bossName;
            case "Vorkath":
                return _config.enableVorkath() ? _config.vorkath() : bossName;
            case "Gauntlet":
                return _config.enableGauntlet() ? _config.gauntlet() : bossName;
            case "Corrupted Gauntlet":
                return _config.enableCorruptedGauntlet() ? _config.corruptedGauntlet() : bossName;
            case "The Maiden of Sugadinti":
                return _config.enableTheMaidenOfSugadinti() ? _config.theMaidenOfSugadinti() : bossName;
            case "Pestilent Bloat":
                return _config.enablePestilentBloat() ? _config.pestilentBloat() : bossName;
            case "Sotetseg":
                return _config.enableSotetseg() ? _config.sotetseg() : bossName;
            case "Xarpus":
                return _config.enableXarpus() ? _config.xarpus() : bossName;
            case "Verzik Vitur":
                return _config.enableVerzikVitur() ? _config.verzikVitur() : bossName;
            case "Ice Demon":
                return _config.enableIceDemon() ? _config.iceDemon() : bossName;
            case "Lizardman Shaman":
                return _config.enableLizardmanShamans() ? _config.lizardmanShamans() : bossName;
            case "Muttadile":
                return _config.enableMuttadiles() ? _config.muttadiles() : bossName;
            case "Skeletal Mystic":
                return _config.enableSkeletalMystic() ? _config.skeletalMystic() : bossName;
            case "Tekton":
                return _config.enableTekton() ? _config.tekton() : bossName;
            case "Vanguard":
                return _config.enableVanguard() ? _config.vanguard() : bossName;
            case "Vasa Nistirio":
                return _config.enableVasaNistirio() ? _config.vasaNistirio() : bossName;
            case "Vespula":
                return _config.enableVespula() ? _config.vespula() : bossName;
            case "Great Olm":
                return _config.enableOlm() ? _config.olm() : bossName;
            case "Great Olm - Left hand":
                return _config.enableOlmsLeftHand() ? _config.olmsLeftHand() : bossName;
            case "Great Olm - Right hand":
                return _config.enableOlmsRightHand() ? _config.olmsRightHand() : bossName;
            case "Kephri":
                return _config.enableKephri() ? _config.kephri() : bossName;
            case "Akkha":
                return _config.enableAkkha() ? _config.akkha() : bossName;
            case "Zebak":
                return _config.enableZebak() ? _config.zebak() : bossName;
            case "Ba-Ba":
                return _config.enableBaba() ? _config.baba() : bossName;
            case "Tumeken's Warden":
                return _config.enableTumekensWarden() ? _config.tumekensWarden() : bossName;
            case "Elidinis' Warden":
                return _config.enableElidinisWarden() ? _config.elidinisWarden() : bossName;
            case "Scurrius":
                return _config.enableScurrius() ? _config.scurrius() : bossName;
            case "Sol Heredit":
                return _config.enableSolHeredit() ? _config.solHeredit() : bossName;
            case "Araxxor":
                return _config.enableAraxxor() ? _config.araxxor() : bossName;
            case "Yama":
                return _config.enableYama() ? _config.yama() : bossName;
            default:
                return bossName;
        }
    }

    @Subscribe
    public void onMenuEntryAdded(MenuEntryAdded event) {

        if (event != null && _config.enableBossNicknames()) {
            String currentBossName = event.getMenuEntry().getTarget();
            event.getMenuEntry().setTarget(event.getTarget().replace(currentBossName, getBossNickname(currentBossName)));
        }
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
