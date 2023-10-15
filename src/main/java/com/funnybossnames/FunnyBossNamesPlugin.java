package com.funnybossnames;

import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.events.ClientTick;
import net.runelite.api.widgets.Widget;
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
public class FunnyBossNamesPlugin extends Plugin
{
	@Inject
	private Client client;

	private List<Boss> bosses;


	@Subscribe
	public void onClientTick(ClientTick event)
	{
		//621 is parent widget collection log
		//Children:
		//CONTAINER = 0;
		//TABS = 3;
		//ENTRY = 17;
		//ENTRY_HEADER = 19;
		//ENTRY_ITEMS = 36;

		Widget bossName = client.getWidget(303,9);
		//Widget colLogName = client.getWidget(621,12);
		Widget colLogNameBig = client.getWidget(621,19);
		//Widget colLogNameSmall = client.getWidget(621,19);
		Widget scoreBoardName = client.getWidget(817,6);

		for (Boss boss : bosses)
		{
			if(bossName != null && bossName.getText().contains(boss.getBossName()))
			{
				bossName.setText(bossName.getText().replace(bossName.getText(),boss.getNewName()));
			}

			// Commented out due to not working consistently
			//if(colLogName != null && colLogName.getChild(27) != null
			//		&& colLogName.getChild(27).getText().contains(boss.getBossName()))
			//{
			//	colLogName = colLogName.getChild(27);
			//	log.info("colLogName was found");
			//	colLogName.setText(colLogName.getText().replace(colLogName.getText(),boss.getNewName()));
			//}

			if(colLogNameBig != null && colLogNameBig.getChild(0) != null
					&& colLogNameBig.getChild(0).getText().contains(boss.getBossName()))
			{
				colLogNameBig = colLogNameBig.getChild(0);
				colLogNameBig.setText(colLogNameBig.getText().replace(colLogNameBig.getText(),boss.getNewName()));
			}

			// Commented out due to not working consistently
			//if(colLogNameSmall != null && colLogNameSmall.getChild(2) != null
			//		&& colLogNameSmall.getChild(2).getText().contains(boss.getBossName()))
			//{
			//	colLogNameSmall = colLogNameSmall.getChild(2);
			//	log.info("colLogNameSmall was found");
			//	colLogNameSmall.setText(colLogNameSmall.getText().replace(colLogNameSmall.getText(),boss.getNewName()));
			//}

			if(scoreBoardName != null && scoreBoardName.getText().contains(boss.getBossName()))
			{
				scoreBoardName.setText(scoreBoardName.getText().replace(scoreBoardName.getText(),boss.getNewName()));
			}
		}
	}

	@Subscribe
	public void onMenuEntryAdded(MenuEntryAdded event)
	{
		for (Boss boss: bosses)
		{
			if (event.getMenuEntry().getTarget().toLowerCase().contains(boss.getBossName().toLowerCase()))
			{
				event.getMenuEntry().setTarget(event.getTarget().replace(boss.getBossName(),boss.getNewName()));
			}
		}
	}

	@Override
	protected void shutDown()
	{
		log.info("Funny boss names plugin stopped!");
	}

	@Override
	protected void startUp() throws Exception
	{
		log.info("Funny boss names plugin started!");
		bosses = Arrays.asList(Boss.values());
	}
}
