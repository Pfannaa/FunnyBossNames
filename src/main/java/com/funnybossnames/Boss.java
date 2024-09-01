package com.funnybossnames;

enum Boss
{
    GENERAL_GRAARDOR("General Graardor", "Garagedoor"),
    KRIL_TSUTSAROTH("K'ril Tsutsaroth", "Krazy K'ril"),
    KREEARRA("Kree'arra", "Squawky McBeaky"),
    COMMANDER_ZILYANA("Commander Zilyana", "Commander Banana"),
    CALLISTO("Callisto", "Beary Potter"),
    ARTIO("Artio", "Bear Grylls"),
    CHAOS_ELEMENTAL("Chaos Elemental", "Whirling Wally"),
    CHAOS_FANATIC("Chaos Fanatic", "Fanatic Funnyman"),
    CRAZY_ARCHAEOLOGIST("Crazy Archaeologist", "Nutty Nerd"),
    KING_BLACK_DRAGON("King Black Dragon", "Bling Bling Dragon King"),
    SCORPIA("Scorpia", "Stingy McStingSting"),
    VENENATIS("Venenatis", "Sitanenev"),
    SPINDEL("Spindel", "Webbed Wacko"),
    VETION("Vet'ion", "Neanderthal Nerd"),
    CALVARION("Calvar'ion", "Prehistoric Prankster"),
    DAGANNOTH_PRIME("Dagannoth Prime", "Optimus Prime"),
    DAGANNOTH_REX("Dagannoth Rex", "Sexy Rexy"),
    DAGANNOTH_SUPREME("Dagannoth Supreme", "Dagannoth Supreme Leader"),
    CORPOREAL_BEAST("Corporeal Beast", "Corporate tax evader"),
    GIANT_MOLE("Giant Mole", "The Spanker"),
    DERANGED_ARCHAEOLOGIST("Deranged Archaeologist", "Insane Investigator"),
    CERBERUS("Cerberus", "Woof Woof Bark"),
    THERMONUCLEAR_SMOKE_DEVIL("Thermonuclear Smoke Devil", "Chernobyl"),
    KRAKEN("Kraken", "Tentacle haver"),
    KALPHITE_QUEEN("Kalphite Queen", "Hugh Jass"),
    DUSK("Dusk", "Rocko"),
    DAWN("Dawn", "Socko"),
    ALCHEMICAL_HYDRA("Alchemical Hydra", "Hoot Hoot Hydra"),
    SARACHNIS("Sarachnis", "Sriracha"),
    ZALCANO("Zalcano", "Rock 'n' Rollcano"),
    PHANTOM_MUSPAH("Phantom Muspah", "The Grumbler"),
    THE_LEVIATHAN("The Leviathan", "Alaskan Bull Worm"),
    VARDORVIS("Vardorvis", "Extendo Arm-azing"),
    DUKE_SUCELLUS("Duke Sucellus", "Obese Obscenity"),
    THE_WHISPERER("The Whisperer", "The Mumbler"),
    WHISPERER("Whisperer", "Mumbler"),
    CHAMBERS_OF_XERIC("Chambers of Xeric", "Cocks"),
    THEATRE_OF_BLOOD("Theatre of Blood", "Theatre of Butt"),
    TOMBS_OF_AMASCUT("Tombs of Amascut", "Tombs of Amascoochie"),
    ABYSSAL_SIRE("Abyssal Sire", "Mike"),
    BARROWS_CHESTS("Barrows Chests", "Barrows Chests"),
    BARROWS_CHEST("Barrows Chest", "Barrows Chest"),
    BRYOPHYTA("Bryophyta", "Firefighter"),
    DAGGANOTH_KINGS("Dagannoth Kings", "Dagannoth Twinks"),
    TZTOK_JAD("TzTok-Jad", "TzTok-FatKok"),
    THE_GAUNTLET("The Gauntlet", "Irons prison"),
    CRYSTALLINE_HUNLEFF("Crystalline Hunleff", "Transparent Dog"),
    CORRUPTED_HUNLEFF("Corrupted Hunleff", "Corrupted Transparent Dog"),
    GROTESQUE_GUARDIANS("Grotesque Guardians", "Rocko and Socko"),
    HESPORI("Hespori", "Cactus Conundrum"),
    THE_INFERNO("The Inferno", "Get in here, it's not that hard..."),
    NEX("Nex", "Sex"),
    THE_NIGHTMARE("The Nightmare", "Gran"),
    PHOSANIS_NIGHTMARE("Phosani's Nightmare", "Gran Gran"),
    OBOR("Obor", "Robo"),
    SKOTIZO("Skotizo", "Skoshizo"),
    TEMPOROSS("Tempoross", "Waterwilly"),
    WINTERTODT("Wintertodt", "Winderdod"),
    ZULRAH("Zulrah", "Danger Noodle"),
    THE_FIGHT_CAVES("The Fight Caves", "Go get your fire cape"),
    VORKATH("Vorkath", "Puff Daddy"),
    GAUNTLET("Gauntlet", "Irons prison"),
    CORRUPTED_GAUNTLET("Corrupted Gauntlet", "Corrupted irons prison"),
    THE_MAIDEN_OF_SUGADINTI("The Maiden of Sugadinti", "The Maiden of Spaghetti"),
    PESTILENT_BLOAT("Pestilent Bloat", "Big Hobo"),
    SOTETSEG("Sotetseg", "Big Dog"),
    XARPUS("Xarpus", "Count Flapula"),
    VERZIK_VITUR("Verzik Vitur", "Bitey McSuckface"),
    ICE_DEMON("Ice Demon", "Beer cooler"),
    LIZARDMAN_SHAMANS("Lizardman Shaman", "Queen Elisabeth II."),
    MUTTADILES("Muttadile", "Croco-Not-So-Doodle"),
    SKELETAL_MYSTIC("Skeletal Mystic", "Crypt Cackler"),
    TEKTON("Tekton", "Crackton"),
    VANGUARD("Vanguard", "Shrimp"),
    VASA_NISTIRIO("Vasa Nistirio", "Ali C Lopez"),
    VESPULA("Vespula", "Nectar nut"),
    OLM("Great Olm", "Big O'"),
    OLMS_LEFT_HAND("Great Olm - Left hand", "Big O's left hand"),
    OLMS_RIGHT_HAND("Great Olm - Right hand", "Big O's right hand"),
    KEPHRI("Kephri", "Dung enjoyer"),
    AKKHA("Akkha", "a"),
    ZEBAK("Zebak", "Croc'O"),
    BABA("Ba-Ba", "Harambe"),
    TUMEKENS_WARDEN("Tumeken's Warden", "Tumeken's Simp"),
    ELIDINIS_WARDEN("Elidinis' Warden", "Eilidinis' Simp"),
    SCURRIUS("Scurrius", "Ratatouille"),
    SOL_HEREDIT("Sol Heredit", "Shmol Wheredidit"),
    ARAXXOR("Araxxor", "Roxxanne")
    ;


    private final String newName;
    private final String bossName;

    Boss(String bossName, String newName)
    {
        this.bossName = bossName;
        this.newName = newName;
    }

    public String getBossName(){
        return bossName;
    }

    public String getNewName(){
        return newName;
    }
}
