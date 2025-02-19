package gregtech.api.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * This is some kind of Periodic Table, which I use to determine Properties of the Materials.
 */
public enum Element {

    _NULL(0, 0, 0, -1, null, "", false),
    H(1, 0, 0, -1, null, "Hydrogen", false),
    D(1, 1, 0, -1, "H", "Deuterium", true),
    T(1, 2, 0, -1, "D", "Tritium", true),
    He(2, 2, 0, -1, null, "Helium", false),
    He_3(2, 1, 0, -1, "H&D", "Helium-3", true),
    Li(3, 4, 0, -1, null, "Lithium", false),
    Be(4, 5, 0, -1, null, "Beryllium", false),
    B(5, 5, 0, -1, null, "Boron", false),
    C(6, 6, 0, -1, null, "Carbon", false),
    N(7, 7, 0, -1, null, "Nitrogen", false),
    O(8, 8, 0, -1, null, "Oxygen", false),
    F(9, 9, 0, -1, null, "Fluorine", false),
    Ne(10, 10, 0, -1, null, "Neon", false),
    Na(11, 11, 0, -1, null, "Sodium", false),
    Mg(12, 12, 0, -1, null, "Magnesium", false),
    Al(13, 13, 0, -1, null, "Aluminium", false),
    Si(14, 14, 0, -1, null, "Silicon", false),
    P(15, 15, 0, -1, null, "Phosphorus", false),
    S(16, 16, 0, -1, null, "Sulfur", false),
    Cl(17, 18, 0, -1, null, "Chlorine", false),
    Ar(18, 22, 0, -1, null, "Argon", false),
    K(19, 20, 0, -1, null, "Potassium", false),
    Ca(20, 20, 0, -1, null, "Calcium", false),
    Sc(21, 24, 0, -1, null, "Scandium", false),
    Ti(22, 26, 0, -1, null, "Titanium", false),
    V(23, 28, 0, -1, null, "Vanadium", false),
    Cr(24, 28, 0, -1, null, "Chrome", false),
    Mn(25, 30, 0, -1, null, "Manganese", false),
    Fe(26, 30, 0, -1, null, "Iron", false),
    Co(27, 32, 0, -1, null, "Cobalt", false),
    Ni(28, 30, 0, -1, null, "Nickel", false),
    Cu(29, 34, 0, -1, null, "Copper", false),
    Zn(30, 35, 0, -1, null, "Zinc", false),
    Ga(31, 39, 0, -1, null, "Gallium", false),
    Ge(32, 40, 0, -1, null, "Germanium", false),
    As(33, 42, 0, -1, null, "Arsenic", false),
    Se(34, 45, 0, -1, null, "Selenium", false),
    Br(35, 44, 0, -1, null, "Bromine", false),
    Kr(36, 48, 0, -1, null, "Krypton", false),
    Rb(37, 48, 0, -1, null, "Rubidium", false),
    Sr(38, 49, 0, -1, null, "Strontium", false),
    Y(39, 50, 0, -1, null, "Yttrium", false),
    Zr(40, 51, 0, -1, null, "Zirconium", false),
    Nb(41, 53, 0, -1, null, "Niobium", false),
    Mo(42, 53, 0, -1, null, "Molybdenum", false),
    Tc(43, 55, 0, -1, null, "Technetium", false),
    Ru(44, 57, 0, -1, null, "Ruthenium", false),
    Rh(45, 58, 0, -1, null, "Rhodium", false),
    Pd(46, 60, 0, -1, null, "Palladium", false),
    Ag(47, 60, 0, -1, null, "Silver", false),
    Cd(48, 64, 0, -1, null, "Cadmium", false),
    In(49, 65, 0, -1, null, "Indium", false),
    Sn(50, 68, 0, -1, null, "Tin", false),
    Sb(51, 70, 0, -1, null, "Antimony", false),
    Te(52, 75, 0, -1, null, "Tellurium", false),
    I(53, 74, 0, -1, null, "Iodine", false),
    Xe(54, 77, 0, -1, null, "Xenon", false),
    Cs(55, 77, 0, -1, null, "Caesium", false),
    Ba(56, 81, 0, -1, null, "Barium", false),
    La(57, 81, 0, -1, null, "Lantanium", false),
    Ce(58, 82, 0, -1, null, "Cerium", false),
    Pr(59, 81, 0, -1, null, "Praseodymium", false),
    Nd(60, 84, 0, -1, null, "Neodymium", false),
    Pm(61, 83, 0, -1, null, "Promethium", false),
    Sm(62, 88, 0, -1, null, "Samarium", false),
    Eu(63, 88, 0, -1, null, "Europium", false),
    Gd(64, 93, 0, -1, null, "Gadolinium", false),
    Tb(65, 93, 0, -1, null, "Terbium", false),
    Dy(66, 96, 0, -1, null, "Dysprosium", false),
    Ho(67, 97, 0, -1, null, "Holmium", false),
    Er(68, 99, 0, -1, null, "Erbium", false),
    Tm(69, 99, 0, -1, null, "Thulium", false),
    Yb(70, 103, 0, -1, null, "Ytterbium", false),
    Lu(71, 103, 0, -1, null, "Lutetium", false),
    Hf(72, 106, 0, -1, null, "Hafnium", false),
    Ta(73, 107, 0, -1, null, "Tantalum", false),
    W(74, 109, 0, -1, null, "Wolframium", false),
    Re(75, 111, 0, -1, null, "Rhenium", false),
    Os(76, 114, 0, -1, null, "Osmium", false),
    Ir(77, 115, 0, -1, null, "Iridium", false),
    Pt(78, 117, 0, -1, null, "Platinum", false),
    Au(79, 117, 0, -1, null, "Gold", false),
    Hg(80, 120, 0, -1, null, "Mercury", false),
    Tl(81, 123, 0, -1, null, "Thallium", false),
    Pb(82, 125, 0, -1, null, "Lead", false),
    Bi(83, 125, 0, -1, null, "Bismuth", false),
    Po(84, 124, 0, -1, null, "Polonium", false),
    At(85, 124, 0, -1, null, "Astatine", false),
    Rn(86, 134, 0, -1, null, "Radon", false),
    Fr(87, 134, 0, -1, null, "Francium", false),
    Ra(88, 136, 0, -1, null, "Radium", false),
    Ac(89, 136, 0, -1, null, "Actinium", false),
    Th(90, 140, 0, -1, null, "Thorium", false),
    Pa(91, 138, 0, -1, null, "Protactinium", false),
    U(92, 146, 0, -1, null, "Uranium", false),
    U_235(92, 143, 0, -1, null, "Uranium-235", true),
    Np(93, 144, 0, -1, null, "Neptunium", false),
    Pu(94, 152, 0, -1, null, "Plutonium", false),
    Pu_241(94, 149, 0, -1, null, "Plutonium-241", true),
    Am(95, 150, 0, -1, null, "Americium", false),
    Cm(96, 153, 0, -1, null, "Curium", false),
    Bk(97, 152, 0, -1, null, "Berkelium", false),
    Cf(98, 153, 0, -1, null, "Californium", false),
    Es(99, 153, 0, -1, null, "Einsteinium", false),
    Fm(100, 157, 0, -1, null, "Fermium", false),
    Md(101, 157, 0, -1, null, "Mendelevium", false),
    No(102, 157, 0, -1, null, "Nobelium", false),
    Lr(103, 159, 0, -1, null, "Lawrencium", false),
    Rf(104, 161, 0, -1, null, "Rutherfordium", false),
    Db(105, 163, 0, -1, null, "Dubnium", false),
    Sg(106, 165, 0, -1, null, "Seaborgium", false),
    Bh(107, 163, 0, -1, null, "Bohrium", false),
    Hs(108, 169, 0, -1, null, "Hassium", false),
    Mt(109, 167, 0, -1, null, "Meitnerium", false),
    Ds(110, 171, 0, -1, null, "Darmstadtium", false),
    Rg(111, 169, 0, -1, null, "Roentgenium", false),
    Cn(112, 173, 0, -1, null, "Copernicium", false),
    Nh(113, 171, 0, -1, null, "Nihonium", false),
    Fl(114, 175, 0, -1, null, "Flerovium", false),
    Mc(115, 173, 0, -1, null, "Moscovium", false),
    Lv(116, 177, 0, -1, null, "Livermorium", false),
    Ts(117, 177, 0, -1, null, "Teness", false),
    Og(118, 176, 0, -1, null, "Oganesson", false),
    Tn(125, 198, 0, -1, null, "Tritanium", false),

    SpFe(26, 42, 0, -1, null, "Meteoric Iron", false),
    De(22, 27, 0, -1, null, "Desh", false),
    Oh(76, 125, 0, -1, null, "Oriharukon", false),
    Di(500, 500, 0, -1, null, "Dimensionally Transcendent Matter", false),

    Ma(0, 0, 100, -1, null, "Magic", false),
    Nq(130, 200, 0, -1, null, "Naquadah", false),
    Nt(0, 100, 0, -1, null, "Neutronium", false),

    $H(-1, -0, 0, -1, null, "Anti-Hydrogen", false),
    $D(-1, -1, 0, -1, "H", "Anti-Deuterium", true),
    $T(-1, -2, 0, -1, "D", "Anti-Tritium", true),
    $He(-2, -2, 0, -1, null, "Anti-Helium", false),
    $He_3(-2, -1, 0, -1, "H&D", "Anti-Helium-3", true),
    $Li(-3, -4, 0, -1, null, "Anti-Lithium", false),
    $Be(-4, -5, 0, -1, null, "Anti-Beryllium", false),
    $B(-5, -5, 0, -1, null, "Anti-Boron", false),
    $C(-6, -6, 0, -1, null, "Anti-Carbon", false),
    $N(-7, -7, 0, -1, null, "Anti-Nitrogen", false),
    $O(-8, -8, 0, -1, null, "Anti-Oxygen", false),
    $F(-9, -9, 0, -1, null, "Anti-Fluorine", false),
    $Ne(-10, -10, 0, -1, null, "Anti-Neon", false),
    $Na(-11, -11, 0, -1, null, "Anti-Sodium", false),
    $Mg(-12, -12, 0, -1, null, "Anti-Magnesium", false),
    $Al(-13, -13, 0, -1, null, "Anti-Aluminium", false),
    $Si(-14, -14, 0, -1, null, "Anti-Silicon", false),
    $P(-15, -15, 0, -1, null, "Anti-Phosphorus", false),
    $S(-16, -16, 0, -1, null, "Anti-Sulfur", false),
    $Cl(-17, -18, 0, -1, null, "Anti-Chlorine", false),
    $Ar(-18, -22, 0, -1, null, "Anti-Argon", false),
    $K(-19, -20, 0, -1, null, "Anti-Potassium", false),
    $Ca(-20, -20, 0, -1, null, "Anti-Calcium", false),
    $Sc(-21, -24, 0, -1, null, "Anti-Scandium", false),
    $Ti(-22, -26, 0, -1, null, "Anti-Titanium", false),
    $V(-23, -28, 0, -1, null, "Anti-Vanadium", false),
    $Cr(-24, -28, 0, -1, null, "Anti-Chrome", false),
    $Mn(-25, -30, 0, -1, null, "Anti-Manganese", false),
    $Fe(-26, -30, 0, -1, null, "Anti-Iron", false),
    $Co(-27, -32, 0, -1, null, "Anti-Cobalt", false),
    $Ni(-28, -30, 0, -1, null, "Anti-Nickel", false),
    $Cu(-29, -34, 0, -1, null, "Anti-Copper", false),
    $Zn(-30, -35, 0, -1, null, "Anti-Zinc", false),
    $Ga(-31, -39, 0, -1, null, "Anti-Gallium", false),
    $Ge(-32, -40, 0, -1, null, "Anti-Germanium", false),
    $As(-33, -42, 0, -1, null, "Anti-Arsenic", false),
    $Se(-34, -45, 0, -1, null, "Anti-Selenium", false),
    $Br(-35, -44, 0, -1, null, "Anti-Bromine", false),
    $Kr(-36, -48, 0, -1, null, "Anti-Krypton", false),
    $Rb(-37, -48, 0, -1, null, "Anti-Rubidium", false),
    $Sr(-38, -49, 0, -1, null, "Anti-Strontium", false),
    $Y(-39, -50, 0, -1, null, "Anti-Yttrium", false),
    $Zr(-40, -51, 0, -1, null, "Anti-Zirconium", false),
    $Nb(-41, -53, 0, -1, null, "Anti-Niobium", false),
    $Mo(-42, -53, 0, -1, null, "Anti-Molybdenum", false),
    $Tc(-43, -55, 0, -1, null, "Anti-Technetium", false),
    $Ru(-44, -57, 0, -1, null, "Anti-Ruthenium", false),
    $Rh(-45, -58, 0, -1, null, "Anti-Rhodium", false),
    $Pd(-46, -60, 0, -1, null, "Anti-Palladium", false),
    $Ag(-47, -60, 0, -1, null, "Anti-Silver", false),
    $Cd(-48, -64, 0, -1, null, "Anti-Cadmium", false),
    $In(-49, -65, 0, -1, null, "Anti-Indium", false),
    $Sn(-50, -68, 0, -1, null, "Anti-Tin", false),
    $Sb(-51, -70, 0, -1, null, "Anti-Antimony", false),
    $Te(-52, -75, 0, -1, null, "Anti-Tellurium", false),
    $I(-53, -74, 0, -1, null, "Anti-Iodine", false),
    $Xe(-54, -77, 0, -1, null, "Anti-Xenon", false),
    $Cs(-55, -77, 0, -1, null, "Anti-Caesium", false),
    $Ba(-56, -81, 0, -1, null, "Anti-Barium", false),
    $La(-57, -81, 0, -1, null, "Anti-Lantanium", false),
    $Ce(-58, -82, 0, -1, null, "Anti-Cerium", false),
    $Pr(-59, -81, 0, -1, null, "Anti-Praseodymium", false),
    $Nd(-60, -84, 0, -1, null, "Anti-Neidymium", false),
    $Pm(-61, -83, 0, -1, null, "Anti-Promethium", false),
    $Sm(-62, -88, 0, -1, null, "Anti-Samarium", false),
    $Eu(-63, -88, 0, -1, null, "Anti-Europium", false),
    $Gd(-64, -93, 0, -1, null, "Anti-Gadolinium", false),
    $Tb(-65, -93, 0, -1, null, "Anti-Terbium", false),
    $Dy(-66, -96, 0, -1, null, "Anti-Dysprosium", false),
    $Ho(-67, -97, 0, -1, null, "Anti-Holmium", false),
    $Er(-68, -99, 0, -1, null, "Anti-Erbium", false),
    $Tm(-69, -99, 0, -1, null, "Anti-Thulium", false),
    $Yb(-70, -103, 0, -1, null, "Anti-Ytterbium", false),
    $Lu(-71, -103, 0, -1, null, "Anti-Lutetium", false),
    $Hf(-72, -106, 0, -1, null, "Anti-Hafnium", false),
    $Ta(-73, -107, 0, -1, null, "Anti-Tantalum", false),
    $W(-74, -109, 0, -1, null, "Anti-Wolframium", false),
    $Re(-75, -111, 0, -1, null, "Anti-Rhenium", false),
    $Os(-76, -114, 0, -1, null, "Anti-Osmium", false),
    $Ir(-77, -115, 0, -1, null, "Anti-Iridium", false),
    $Pt(-78, -117, 0, -1, null, "Anti-Platinum", false),
    $Au(-79, -117, 0, -1, null, "Anti-Gold", false),
    $Hg(-80, -120, 0, -1, null, "Anti-Mercury", false),
    $Tl(-81, -123, 0, -1, null, "Anti-Thallium", false),
    $Pb(-82, -125, 0, -1, null, "Anti-Lead", false),
    $Bi(-83, -125, 0, -1, null, "Anti-Bismuth", false),
    $Po(-84, -124, 0, -1, null, "Anti-Polonium", false),
    $At(-85, -124, 0, -1, null, "Anti-Astatine", false),
    $Rn(-86, -134, 0, -1, null, "Anti-Radon", false),
    $Fr(-87, -134, 0, -1, null, "Anti-Francium", false),
    $Ra(-88, -136, 0, -1, null, "Anti-Radium", false),
    $Ac(-89, -136, 0, -1, null, "Anti-Actinium", false),
    $Th(-90, -140, 0, -1, null, "Anti-Thorium", false),
    $Pa(-91, -138, 0, -1, null, "Anti-Protactinium", false),
    $U(-92, -146, 0, -1, null, "Anti-Uranium", false),
    $U_235(-92, -143, 0, -1, null, "Anti-Uranium-235", true),
    $Np(-93, -144, 0, -1, null, "Anti-Neptunium", false),
    $Pu(-94, -152, 0, -1, null, "Anti-Plutonium", false),
    $Pu_241(-94, -149, 0, -1, null, "Anti-Plutonium-241", true),
    $Am(-95, -150, 0, -1, null, "Anti-Americium", false),
    $Cm(-96, -153, 0, -1, null, "Anti-Curium", false),
    $Bk(-97, -152, 0, -1, null, "Anti-Berkelium", false),
    $Cf(-98, -153, 0, -1, null, "Anti-Californium", false),
    $Es(-99, -153, 0, -1, null, "Anti-Einsteinium", false),
    $Fm(-100, -157, 0, -1, null, "Anti-Fermium", false),
    $Md(-101, -157, 0, -1, null, "Anti-Mendelevium", false),
    $No(-102, -157, 0, -1, null, "Anti-Nobelium", false),
    $Lr(-103, -159, 0, -1, null, "Anti-Lawrencium", false),
    $Rf(-104, -161, 0, -1, null, "Anti-Rutherfordium", false),
    $Db(-105, -163, 0, -1, null, "Anti-Dubnium", false),
    $Sg(-106, -165, 0, -1, null, "Anti-Seaborgium", false),
    $Bh(-107, -163, 0, -1, null, "Anti-Bohrium", false),
    $Hs(-108, -169, 0, -1, null, "Anti-Hassium", false),
    $Mt(-109, -167, 0, -1, null, "Anti-Meitnerium", false),
    $Ds(-110, -171, 0, -1, null, "Anti-Darmstadtium", false),
    $Rg(-111, -169, 0, -1, null, "Anti-Roentgenium", false),
    $Cn(-112, -173, 0, -1, null, "Anti-Copernicium", false),
    $Nh(-113, -171, 0, -1, null, "Anti-Nihonium", false),
    $Fl(-114, -175, 0, -1, null, "Anti-Flerovium", false),
    $Mc(-115, -173, 0, -1, null, "Anti-Moscovium", false),
    $Lv(-116, -177, 0, -1, null, "Anti-Livermorium", false),
    $Ts(-117, -177, 0, -1, null, "Anti-Tenness", false),
    $Og(-118, -176, 0, -1, null, "Anti-Oganesson", false),
    $Tn(-125, -198, 0, -1, null, "Anti-Tritanium", false),

    $SpFe(-26, -42, 0, -1, null, "Anti-Meteoric Iron", true),
    $De(-22, -27, 0, -1, null, "Anti-Desh", true),
    $Oh(-76, -125, 0, -1, null, "Anti-Oriharukon", true),

    $Ma(0, 0, -100, -1, null, "Anti-Magic", false),
    $Nq(-130, -200, 0, -1, null, "Anti-Naquadah", false),
    $Nt(0, -10000, 0, -1, null, "Anti-Neutronium", false);

    public static volatile int VERSION = 509;
    public final long mProtons, mNeutrons, mAdditionalMass, mHalfLifeSeconds;
    public final String mName, mDecayTo;
    public final boolean mIsIsotope;

    /**
     * Links to every pure Material containing just this Element.
     */
    public ArrayList<Materials> mLinkedMaterials = new ArrayList<>();

    /**
     * @param aProtons         Amount of Protons. Antiprotons if negative.
     * @param aNeutrons        Amount of Neutrons. Antineutrons if negative. (I could have made mistakes with the
     *                         Neutron amount calculation, please tell me if I did something wrong)
     * @param aHalfLifeSeconds Amount of Half Life this Material has in Seconds. -1 for stable Materials.
     * @param aDecayTo         String representing the Elements it decays to. Separated by an '&' Character.
     * @param aName            Name of the Element
     */
    Element(long aProtons, long aNeutrons, long aAdditionalMass, long aHalfLifeSeconds, String aDecayTo, String aName,
        boolean aIsIsotope) {
        mProtons = aProtons;
        mNeutrons = aNeutrons;
        mAdditionalMass = aAdditionalMass;
        mHalfLifeSeconds = aHalfLifeSeconds;
        mDecayTo = aDecayTo;
        mName = aName;
        mIsIsotope = aIsIsotope;
        Companion.VALUES.put(name(), this);
    }

    public static Element get(String aMaterialName) {
        return Companion.VALUES.getOrDefault(aMaterialName, _NULL);
    }

    public long getProtons() {
        return mProtons;
    }

    public long getNeutrons() {
        return mNeutrons;
    }

    public long getMass() {
        return mProtons + mNeutrons + mAdditionalMass;
    }

    /**
     * A companion object to workaround java limitations
     */
    private static final class Companion {

        /**
         * Why is this a separate map and populated by enum constructor instead of a Map prepoluated with values()?
         * Because apparently there are people hacking into this enum via EnumHelper.
         */
        private static final Map<String, Element> VALUES = new HashMap<>();
    }
}
