package com.funnybossnames;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// To add a boss: add its two config items to FunnyBossNamesConfig and one entry here.
// Names are matched exactly (ignoring case), so text that only contains a boss name is never touched.
@Getter
@RequiredArgsConstructor
enum Boss {
    GENERAL_GRAARDOR("General Graardor", FunnyBossNamesConfig::enableGeneralGraardor, FunnyBossNamesConfig::generalGraardor),
    KRIL_TSUTSAROTH("K'ril Tsutsaroth", FunnyBossNamesConfig::enableKrilTsutsaroth, FunnyBossNamesConfig::krilTsutsaroth),
    KREEARRA("Kree'arra", FunnyBossNamesConfig::enableKreearra, FunnyBossNamesConfig::kreearra),
    BRUTUS("Brutus", FunnyBossNamesConfig::enableBrutus, FunnyBossNamesConfig::brutus),
    COMMANDER_ZILYANA("Commander Zilyana", FunnyBossNamesConfig::enableCommanderZilyana, FunnyBossNamesConfig::commanderZilyana),
    SHELLBANE_GRYPHON("Shellbane Gryphon", FunnyBossNamesConfig::enableShellbaneGryphon, FunnyBossNamesConfig::shellbaneGryphon),
    CALLISTO("Callisto", FunnyBossNamesConfig::enableCallisto, FunnyBossNamesConfig::callisto),
    ARTIO("Artio", FunnyBossNamesConfig::enableArtio, FunnyBossNamesConfig::artio),
    CHAOS_ELEMENTAL("Chaos Elemental", FunnyBossNamesConfig::enableChaosElemental, FunnyBossNamesConfig::chaosElemental),
    CHAOS_FANATIC("Chaos Fanatic", FunnyBossNamesConfig::enableChaosFanatic, FunnyBossNamesConfig::chaosFanatic),
    CRAZY_ARCHAEOLOGIST("Crazy Archaeologist", FunnyBossNamesConfig::enableCrazyArchaeologist, FunnyBossNamesConfig::crazyArchaeologist),
    KING_BLACK_DRAGON("King Black Dragon", FunnyBossNamesConfig::enableKingBlackDragon, FunnyBossNamesConfig::kingBlackDragon),
    SCORPIA("Scorpia", FunnyBossNamesConfig::enableScorpia, FunnyBossNamesConfig::scorpia),
    VENENATIS("Venenatis", FunnyBossNamesConfig::enableVenenatis, FunnyBossNamesConfig::venenatis),
    SPINDEL("Spindel", FunnyBossNamesConfig::enableSpindel, FunnyBossNamesConfig::spindel),
    VETION("Vet'ion", FunnyBossNamesConfig::enableVetion, FunnyBossNamesConfig::vetion),
    CALVARION("Calvar'ion", FunnyBossNamesConfig::enableCalvarion, FunnyBossNamesConfig::calvarion),
    DAGANNOTH_PRIME("Dagannoth Prime", FunnyBossNamesConfig::enableDagannothPrime, FunnyBossNamesConfig::dagannothPrime),
    DAGANNOTH_REX("Dagannoth Rex", FunnyBossNamesConfig::enableDagannothRex, FunnyBossNamesConfig::dagannothRex),
    DAGANNOTH_SUPREME("Dagannoth Supreme", FunnyBossNamesConfig::enableDagannothSupreme, FunnyBossNamesConfig::dagannothSupreme),
    CORPOREAL_BEAST("Corporeal Beast", FunnyBossNamesConfig::enableCorporealBeast, FunnyBossNamesConfig::corporealBeast),
    GIANT_MOLE("Giant Mole", FunnyBossNamesConfig::enableGiantMole, FunnyBossNamesConfig::giantMole),
    DERANGED_ARCHAEOLOGIST("Deranged Archaeologist", FunnyBossNamesConfig::enableDerangedArchaeologist, FunnyBossNamesConfig::derangedArchaeologist),
    CERBERUS("Cerberus", FunnyBossNamesConfig::enableCerberus, FunnyBossNamesConfig::cerberus),
    THERMONUCLEAR_SMOKE_DEVIL("Thermonuclear Smoke Devil", FunnyBossNamesConfig::enableThermonuclearSmokeDevil, FunnyBossNamesConfig::thermonuclearSmokeDevil),
    KRAKEN("Kraken", FunnyBossNamesConfig::enableKraken, FunnyBossNamesConfig::kraken),
    KALPHITE_QUEEN("Kalphite Queen", FunnyBossNamesConfig::enableKalphiteQueen, FunnyBossNamesConfig::kalphiteQueen),
    DUSK("Dusk", FunnyBossNamesConfig::enableDusk, FunnyBossNamesConfig::dusk),
    DAWN("Dawn", FunnyBossNamesConfig::enableDawn, FunnyBossNamesConfig::dawn),
    ALCHEMICAL_HYDRA("Alchemical Hydra", FunnyBossNamesConfig::enableAlchemicalHydra, FunnyBossNamesConfig::alchemicalHydra),
    SARACHNIS("Sarachnis", FunnyBossNamesConfig::enableSarachnis, FunnyBossNamesConfig::sarachnis),
    ZALCANO("Zalcano", FunnyBossNamesConfig::enableZalcano, FunnyBossNamesConfig::zalcano),
    PHANTOM_MUSPAH("Phantom Muspah", FunnyBossNamesConfig::enablePhantomMuspah, FunnyBossNamesConfig::phantomMuspah),
    THE_LEVIATHAN("The Leviathan", FunnyBossNamesConfig::enableTheLeviathan, FunnyBossNamesConfig::theLeviathan),
    VARDORVIS("Vardorvis", FunnyBossNamesConfig::enableVardorvis, FunnyBossNamesConfig::vardorvis),
    DUKE_SUCCELLUS("Duke Sucellus", FunnyBossNamesConfig::enableDukeSuccellus, FunnyBossNamesConfig::dukeSuccellus),
    THE_WHISPERER("The Whisperer", FunnyBossNamesConfig::enableTheWhisperer, FunnyBossNamesConfig::theWhisperer),
    WHISPERER("Whisperer", FunnyBossNamesConfig::enableWhisperer, FunnyBossNamesConfig::whisperer),
    CHAMBERS_OF_XERIC("Chambers of Xeric", FunnyBossNamesConfig::enableChambersOfXeric, FunnyBossNamesConfig::chambersOfXeric),
    THEATRE_OF_BLOOD("Theatre of Blood", FunnyBossNamesConfig::enableTheatreOfBlood, FunnyBossNamesConfig::theatreOfBlood),
    TOMBS_OF_AMASCUT("Tombs of Amascut", FunnyBossNamesConfig::enableTombsOfAmascut, FunnyBossNamesConfig::tombsOfAmascut),
    ABYSSAL_SIRE("Abyssal Sire", FunnyBossNamesConfig::enableAbyssalSire, FunnyBossNamesConfig::abyssalSire),
    BARROWS_CHESTS("Barrows Chests", FunnyBossNamesConfig::enableBarrowsChests, FunnyBossNamesConfig::barrowsChests),
    BARROWS_CHEST("Barrows Chest", FunnyBossNamesConfig::enableBarrowsChest, FunnyBossNamesConfig::barrowsChest),
    BRYOPHYTA("Bryophyta", FunnyBossNamesConfig::enableBryophyta, FunnyBossNamesConfig::bryophyta),
    DAGGANOTHE_KINGS("Dagannoth Kings", FunnyBossNamesConfig::enableDagganotheKings, FunnyBossNamesConfig::dagganotheKings),
    TZTOK_JAD("TzTok-Jad", FunnyBossNamesConfig::enableTztokJad, FunnyBossNamesConfig::tztokJad),
    THE_GAUNTLET("The Gauntlet", FunnyBossNamesConfig::enableTheGauntlet, FunnyBossNamesConfig::theGauntlet),
    CRYSTALLINE_HUNLLEF("Crystalline Hunllef", FunnyBossNamesConfig::enableCrystallineHunllef, FunnyBossNamesConfig::crystallineHunllef),
    CORRUPTED_HUNLLEF("Corrupted Hunllef", FunnyBossNamesConfig::enableCorruptedHunllef, FunnyBossNamesConfig::corruptedHunllef),
    GROTESQUE_GUARDIANS("Grotesque Guardians", FunnyBossNamesConfig::enableGrotesqueGuardians, FunnyBossNamesConfig::grotesqueGuardians),
    HESPORI("Hespori", FunnyBossNamesConfig::enableHespori, FunnyBossNamesConfig::hespori),
    THE_INFERNO("The Inferno", FunnyBossNamesConfig::enableTheInferno, FunnyBossNamesConfig::theInferno),
    NEX("Nex", FunnyBossNamesConfig::enableNex, FunnyBossNamesConfig::nex),
    THE_NIGHTMARE("The Nightmare", FunnyBossNamesConfig::enableTheNightmare, FunnyBossNamesConfig::theNightmare),
    PHOSANIS_NIGHTMARE("Phosani's Nightmare", FunnyBossNamesConfig::enablePhosanisNightmare, FunnyBossNamesConfig::phosanisNightmare),
    OBOR("Obor", FunnyBossNamesConfig::enableObor, FunnyBossNamesConfig::obor),
    SKOTIZO("Skotizo", FunnyBossNamesConfig::enableSkotizo, FunnyBossNamesConfig::skotizo),
    TEMPOROSS("Tempoross", FunnyBossNamesConfig::enableTempoross, FunnyBossNamesConfig::tempoross),
    WINTERTODT("Wintertodt", FunnyBossNamesConfig::enableWintertodt, FunnyBossNamesConfig::wintertodt),
    ZULRAH("Zulrah", FunnyBossNamesConfig::enableZulrah, FunnyBossNamesConfig::zulrah),
    THE_FIGHT_CAVES("The Fight Caves", FunnyBossNamesConfig::enableTheFightCaves, FunnyBossNamesConfig::theFightCaves),
    VORKATH("Vorkath", FunnyBossNamesConfig::enableVorkath, FunnyBossNamesConfig::vorkath),
    GAUNTLET("Gauntlet", FunnyBossNamesConfig::enableGauntlet, FunnyBossNamesConfig::gauntlet),
    CORRUPTED_GAUNTLET("Corrupted Gauntlet", FunnyBossNamesConfig::enableCorruptedGauntlet, FunnyBossNamesConfig::corruptedGauntlet),
    THE_MAIDEN_OF_SUGADINTI("The Maiden of Sugadinti", FunnyBossNamesConfig::enableTheMaidenOfSugadinti, FunnyBossNamesConfig::theMaidenOfSugadinti),
    PESTILENT_BLOAT("Pestilent Bloat", FunnyBossNamesConfig::enablePestilentBloat, FunnyBossNamesConfig::pestilentBloat),
    SOTETSEG("Sotetseg", FunnyBossNamesConfig::enableSotetseg, FunnyBossNamesConfig::sotetseg),
    XARPUS("Xarpus", FunnyBossNamesConfig::enableXarpus, FunnyBossNamesConfig::xarpus),
    VERZIK_VITUR("Verzik Vitur", FunnyBossNamesConfig::enableVerzikVitur, FunnyBossNamesConfig::verzikVitur),
    ICE_DEMON("Ice Demon", FunnyBossNamesConfig::enableIceDemon, FunnyBossNamesConfig::iceDemon),
    LIZARDMAN_SHAMANS("Lizardman Shaman", FunnyBossNamesConfig::enableLizardmanShamans, FunnyBossNamesConfig::lizardmanShamans),
    MUTTADILES("Muttadile", FunnyBossNamesConfig::enableMuttadiles, FunnyBossNamesConfig::muttadiles),
    SKELETAL_MYSTIC("Skeletal Mystic", FunnyBossNamesConfig::enableSkeletalMystic, FunnyBossNamesConfig::skeletalMystic),
    TEKTON("Tekton", FunnyBossNamesConfig::enableTekton, FunnyBossNamesConfig::tekton),
    VANGUARD("Vanguard", FunnyBossNamesConfig::enableVanguard, FunnyBossNamesConfig::vanguard),
    VASA_NISTIRIO("Vasa Nistirio", FunnyBossNamesConfig::enableVasaNistirio, FunnyBossNamesConfig::vasaNistirio),
    VESPULA("Vespula", FunnyBossNamesConfig::enableVespula, FunnyBossNamesConfig::vespula),
    OLM("Great Olm", FunnyBossNamesConfig::enableOlm, FunnyBossNamesConfig::olm),
    OLMS_LEFT_HAND("Great Olm - Left hand", FunnyBossNamesConfig::enableOlmsLeftHand, FunnyBossNamesConfig::olmsLeftHand),
    OLMS_RIGHT_HAND("Great Olm - Right hand", FunnyBossNamesConfig::enableOlmsRightHand, FunnyBossNamesConfig::olmsRightHand),
    KEPHRI("Kephri", FunnyBossNamesConfig::enableKephri, FunnyBossNamesConfig::kephri),
    AKKHA("Akkha", FunnyBossNamesConfig::enableAkkha, FunnyBossNamesConfig::akkha),
    ZEBAK("Zebak", FunnyBossNamesConfig::enableZebak, FunnyBossNamesConfig::zebak),
    BABA("Ba-Ba", FunnyBossNamesConfig::enableBaba, FunnyBossNamesConfig::baba),
    TUMEKENS_WARDEN("Tumeken's Warden", FunnyBossNamesConfig::enableTumekensWarden, FunnyBossNamesConfig::tumekensWarden),
    ELIDINIS_WARDEN("Elidinis' Warden", FunnyBossNamesConfig::enableElidinisWarden, FunnyBossNamesConfig::elidinisWarden),
    SCURRIUS("Scurrius", FunnyBossNamesConfig::enableScurrius, FunnyBossNamesConfig::scurrius),
    SOL_HEREDIT("Sol Heredit", FunnyBossNamesConfig::enableSolHeredit, FunnyBossNamesConfig::solHeredit),
    ARAXXOR("Araxxor", FunnyBossNamesConfig::enableAraxxor, FunnyBossNamesConfig::araxxor),
    YAMA("Yama", FunnyBossNamesConfig::enableYama, FunnyBossNamesConfig::yama),
    BLOOD_MOON("Blood Moon", FunnyBossNamesConfig::enableBloodMoon, FunnyBossNamesConfig::bloodMoon),
    BLUE_MOON("Blue Moon", FunnyBossNamesConfig::enableBlueMoon, FunnyBossNamesConfig::blueMoon),
    ECLIPSE_MOON("Eclipse Moon", FunnyBossNamesConfig::enableEclipseMoon, FunnyBossNamesConfig::eclipseMoon),
    THE_HUEYCOATL("The Hueycoatl", FunnyBossNamesConfig::enableTheHueycoatl, FunnyBossNamesConfig::theHueycoatl),
    AMOXLIATL("Amoxliatl", FunnyBossNamesConfig::enableAmoxliatl, FunnyBossNamesConfig::amoxliatl),
    BRANDA_THE_FIRE_QUEEN("Branda the Fire Queen", FunnyBossNamesConfig::enableBrandaTheFireQueen, FunnyBossNamesConfig::brandaTheFireQueen),
    ELDRIC_THE_ICE_KING("Eldric the Ice King", FunnyBossNamesConfig::enableEldricTheIceKing, FunnyBossNamesConfig::eldricTheIceKing),
    MAD_ANGEL("Mad Angel", FunnyBossNamesConfig::enableMadAngel, FunnyBossNamesConfig::madAngel),
    MAGGOT_KING("Maggot King", FunnyBossNamesConfig::enableMaggotKing, FunnyBossNamesConfig::maggotKing),
    GEMSTONE_CRAB("Gemstone Crab", FunnyBossNamesConfig::enableGemstoneCrab, FunnyBossNamesConfig::gemstoneCrab),
    AHRIM_THE_BLIGHTED("Ahrim the Blighted", FunnyBossNamesConfig::enableAhrimTheBlighted, FunnyBossNamesConfig::ahrimTheBlighted),
    DHAROK_THE_WRETCHED("Dharok the Wretched", FunnyBossNamesConfig::enableDharokTheWretched, FunnyBossNamesConfig::dharokTheWretched),
    GUTHAN_THE_INFESTED("Guthan the Infested", FunnyBossNamesConfig::enableGuthanTheInfested, FunnyBossNamesConfig::guthanTheInfested),
    KARIL_THE_TAINTED("Karil the Tainted", FunnyBossNamesConfig::enableKarilTheTainted, FunnyBossNamesConfig::karilTheTainted),
    TORAG_THE_CORRUPTED("Torag the Corrupted", FunnyBossNamesConfig::enableToragTheCorrupted, FunnyBossNamesConfig::toragTheCorrupted),
    VERAC_THE_DEFILED("Verac the Defiled", FunnyBossNamesConfig::enableVeracTheDefiled, FunnyBossNamesConfig::veracTheDefiled),
    TZKAL_ZUK("TzKal-Zuk", FunnyBossNamesConfig::enableTzkalZuk, FunnyBossNamesConfig::tzkalZuk),
    THE_MIMIC("The Mimic", FunnyBossNamesConfig::enableTheMimic, FunnyBossNamesConfig::theMimic),
    NYLOCAS_VASILIAS("Nylocas Vasilias", FunnyBossNamesConfig::enableNylocasVasilias, FunnyBossNamesConfig::nylocasVasilias),
    MOKHA("Doom of Mokhaiotl", FunnyBossNamesConfig::enableMokha, FunnyBossNamesConfig::mokha);

    private static final Map<String, Boss> BY_NAME = Arrays.stream(values())
            .collect(Collectors.toMap(boss -> boss.npcName.toLowerCase(Locale.ROOT), Function.identity()));

    private final String npcName;
    private final Predicate<FunnyBossNamesConfig> enabled;
    private final Function<FunnyBossNamesConfig, String> nickname;

    static Boss fromNpcName(String name) {
        return name == null ? null : BY_NAME.get(name.trim().toLowerCase(Locale.ROOT));
    }
}
