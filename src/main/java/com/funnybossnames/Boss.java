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
    SCORPIA("Scorpia", "Scorpia"),
    VENENATIS("Venenatis", "Venenatis, the Spider with a Sense of Slapstick"),
    SPINDEL("Spindel", "The Webbed Wacko"),
    VETION("Vet'ion", "The Neanderthal Nerd"),
    CALVARION("Calvar'ion", "The Prehistoric Prankster"),
    DAGANNOTH_PRIME("Dagannoth Prime", "Optimus Prime"),
    DAGANNOTH_REX("Dagannoth Rex", "Sexy Rexy"),
    DAGANNOTH_SUPREME("Dagannoth Supreme", "Dagannoth Supreme Leader"),
    CORPOREAL_BEAST("Corporeal Beast", "Sigil giver"),
    GIANT_MOLE("Giant Mole", "The Spanker"),
    DERANGED_ARCHAEOLOGIST("Deranged Archaeologist", "Insane Investigator"),
    CERBERUS("Cerberus", "Woof Woof Bark"),
    THERMONUCLEAR_SMOKE_DEVIL("Thermonuclear Smoke Devil", "Chernobyl"),
    KRAKEN("Kraken", "Tentacle haver"),
    KALPHITE_QUEEN("Kalphite Queen", "Kalphite Queen"),
    DUSK("Dusk", "Rocko"),
    DAWN("Dawn", "Socko"),
    ALCHEMICAL_HYDRA("Alchemical Hydra", "Hoot Hoot Hydra"),
    SARACHNIS("Sarachnis", "Sriracha"),
    ZALCANO("Zalcano", "Rock 'n' Rollcano"),
    PHANTOM_MUSPAH("Phantom Muspah", "The grumbler"),
    THE_LEVIATHAN("The Leviathan", "Alaskan Bull Worm"),
    VARDORVIS("Vardorvis", "Extendo Arm-azing"),
    DUKE_SUCELLUS("Duke Sucellus", "The Obese Obscenity"),
    THE_WHISPERER("The Whisperer", "The Whisperer"),
    WHISPERER("Whisperer", "Whisperer"),
    CHAMBERS_OF_XERIC("Chambers of Xeric", "Chambers of Xeric"),
    THEATRE_OF_BLOOD("Theatre of Blood", "Theatre of Blood"),
    TOMBS_OF_AMASCUT("Tombs of Amascut", "Tombs of Amascut"),
    ABYSSAL_SIRE("Abyssal Sire", "Abyssal Sire"),
    BARROWS_CHESTS("Barrows Chests", "Barrows Chests"),
    BRYOPHYTA("Bryophyta", "Bryophyta"),
    DAGGANOTH_KINGS("Dagannoth Kings", "Dagannoth Twinks"),
    TZTOK_JAD("TzTok-Jad", "TzTok-Jad"),
    THE_GAUNTLET("The Gauntlet", "The Gauntlet"),
    CRYSTALLINE_HUNLEFF("Crystalline Hunleff", "Crystalline Hunleff"),
    CORRUPTED_HUNLEFF("Corrupted Hunleff", "Corrupted Hunleff"),
    GROTESQUE_GUARDIANS("Grotesque Guardians", "Rocko and Socko"),
    HESPORI("Hespori", "The Cactus Conundrum"),
    THE_INFERNO("The Inferno", "Sauna"),
    NEX("Nex", "Nex"),
    THE_NIGHTMARE("The Nightmare", "Gran"),
    PHOSANIS_NIGHTMARE("Phosani's Nightmare", "Gran Gran"),
    OBOR("Obor", "Obor"),
    SKOTIZO("Skotizo", "Skotizo"),
    TEMPOROSS("Tempoross", "Tempoross"),
    WINTERTODT("Wintertodt", "Wintertodt"),
    ZULRAH("Zulrah", "Zulrah"),
    THE_FIGHT_CAVES("The Fight Caves", "The Fight Caves"),
    VORKATH("Vorkath", "Vorkath"),
    GAUNTLET("Gauntlet", "Gauntlet"),
    CORRUPTED_GAUNTLET("Corrupted Gauntlet", "Corrupted Gauntlet"),
    THE_MAIDEN_OF_SUGADINTI("The Maiden of Sugadinti", "The Maiden of Sugadinti"),
    PESTILENT_BLOAT("Pestilent Bloat", "Big Hobo"),
    SOTETSEG("Sotetseg", "Sotetseg"),
    XARPUS("Xarpus", "Count Flapula"),
    VERZIK_VITUR("Verzik Vitur", "Bitey McSuckface"),
    ICE_DEMON("Ice Demon", "Cold guy"),
    LIZARDMAN_SHAMANS("Lizardman Shaman", "Queen Elisabeth II."),
    MUTTADILES("Muttadile", "Croco-Not-So-Doodle"),
    SKELETAL_MYSTIC("Skeletal Mystic", "Crypt Cackler"),
    TEKTON("Tekton", "Crackton"),
    VANGUARD("Vanguard", "Vanguard"),
    VASA_NISTIRIO("Vasa Nistirio", "Vasa Nistirio"),
    VESPULA("Vespula", "Vespula"),
    OLM("Great Olm", "Big O'"),
    OLMS_LEFT_HAND("Great Olm - Left hand", "Big O's left fap hand"),
    OLMS_RIGHT_HAND("Great Olm - Right hand", "Big O's right fap hand"),
    KEPHRI("Kephri", "Dung beetle"),
    AKKHA("Akkha", "a"),
    ZEBAK("Zebak", "Croco"),
    BABA("Ba-Ba", "Harambe"),
    TUMEKENS_WARDEN("Tumeken's Warden", "Tumeken's Simp"),
    ELIDINIS_WARDEN("Elidinis' Warden", "Eilidinis' Simp")
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
