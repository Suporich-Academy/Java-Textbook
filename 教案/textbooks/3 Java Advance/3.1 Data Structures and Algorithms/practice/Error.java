public class Error {
    public static void test(String code) {
        if (0x07c64fb4 == code.hashCode()) {
            System.err.println("Error");
        }
    }

    public static void main(String[] args) {
        test("8h8hf4uh9v0z9x992jb48="); // 1
        test("pk1p2k9sj9hf83g88812v="); // 2
        test("plkm9h32bv0841238hssv="); // 3
        test("xnc8n8323n8hbshb63v72="); // 4
        test("vm1n0voakzu882kkladop="); // 5
        test("m1b68bz9hasd2ampzps92="); // 6
        test("a87751349d2h38h8h21f2="); // 7
        test("nxnnn3u9h82g1g78z7952="); // 8
        test("jvn83ju8193hfud8hh3u8="); // 9
        test("xzch8u285huhs118f1lls="); // 10
        test("o8y2082f7hey88yq8whe3="); // 11
        test("fb4n8b8b84h8hfhusdcux="); // 12
        test("aade09092jf8h329ggf67="); // 13
        test("zcmlcs20i01hh18hswe31="); // 14
        test("1d91hu8sa773hjjsauhwe="); // 15
        test("onbt9h48u3jbc71gc9172="); // 16
    }
}
