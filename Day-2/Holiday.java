class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String n, int d, String m) {
        name = n;
        day = d;
        month = m;

    }

    public static boolean inSameMonth(Holiday holiday1, Holiday holiday2) {
        if (holiday1.month.equals(holiday2.month))
            return true;
        else
            return false;
    }

    public static double avgDate(Holiday[] holidays) {
        int sum = 0;
        for (int i = 0; i < holidays.length; i++) {
            sum = sum + holidays[i].day;
        }
        return ((double) sum) / holidays.length;
    }


    public static void main(String[] args) {
        Holiday h1 = new Holiday("Independence Day", 4, "July");
        Holiday h2 = new Holiday("Republic Day", 26, "January");
        System.out.println(Holiday.inSameMonth(h1, h2));

    }
}
