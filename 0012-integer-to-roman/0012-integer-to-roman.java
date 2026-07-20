class Solution {

    public String intToRoman(int num) {

        return thousands(num / 1000)
                + hundreds((num % 1000) / 100)
                + tens((num % 100) / 10)
                + ones(num % 10);
    }

    private String thousands(int n) {
        switch (n) {
            case 1: return "M";
            case 2: return "MM";
            case 3: return "MMM";
            default: return "";
        }
    }

    private String hundreds(int n) {
        switch (n) {
            case 1: return "C";
            case 2: return "CC";
            case 3: return "CCC";
            case 4: return "CD";
            case 5: return "D";
            case 6: return "DC";
            case 7: return "DCC";
            case 8: return "DCCC";
            case 9: return "CM";
            default: return "";
        }
    }

    private String tens(int n) {
        switch (n) {
            case 1: return "X";
            case 2: return "XX";
            case 3: return "XXX";
            case 4: return "XL";
            case 5: return "L";
            case 6: return "LX";
            case 7: return "LXX";
            case 8: return "LXXX";
            case 9: return "XC";
            default: return "";
        }
    }

    private String ones(int n) {
        switch (n) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            default: return "";
        }
    }
}