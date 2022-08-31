package labs_examples.enumerations.labs;

public class EnumTest {
    Month month;

    public EnumTest(Month month) {
        this.month = month;
    }

    public void tellItLikeItIs() {
        switch (month) {
            case January:
            case February:
            case March:
                System.out.println("one fourth of the year passed");
                break;

            case April:
            case May:
            case June:
                System.out.println("two fourths of the year passed");
                break;

            case July:
            case August:
            case September:
                System.out.println("three fourths of the year passed");
                break;

            case October:
            case November:
            case December:
                System.out.println("The whole year almost passed");
                break;
        }
    }

    public static void main(String[] args) {
        EnumTest firstMonth = new EnumTest(Month.January);
        firstMonth.tellItLikeItIs();
        EnumTest sixthMonth = new EnumTest(Month.June);
        sixthMonth.tellItLikeItIs();
        EnumTest eleventhDay = new EnumTest(Month.November);
        eleventhDay.tellItLikeItIs();
    }
}