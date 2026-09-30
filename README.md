# FunnyBossNames
Replaces plain old boring boss names with something more fun.

Right click General Graardor and you'll get "Attack Garagedoor" instead. Same goes for the mouse hover text.
Only the right click menu is changed, the game itself doesn't care, so nothing breaks.

## Settings
Every boss has its own toggle and nickname in the plugin settings, so if you don't like one of my names just change it.
Clearing a nickname or turning the toggle off shows the real name again.
There's also a master toggle at the top to turn everything off at once.

## Some examples
- General Graardor -> Garagedoor
- Kree'arra -> Squawky McBeaky
- Commander Zilyana -> Commander Banana
- Amoxliatl -> Amoxicillin
- TzKal-Zuk -> TzKal-Zucc

and a lot more, didn't want to spoil all of them.

## Known stuff
- Only NPCs get renamed. Older versions also changed the boss health bar and pets, but that clashed with other plugins (quest helper mostly), so i dropped it.
- If a boss doesn't get renamed, its in-game name is probably slightly different from what i put in. Open an issue with the exact name and i'll fix it.

## Adding a boss
If you want to open a PR for a new boss:
1. Add the toggle and nickname to `FunnyBossNamesConfig`, just copy one of the existing ones.
2. Add one line to the `Boss` enum with the exact in-game name.

That's it.

Do not hesitate to create an issue with some name suggestions, they are greatly appreciated
