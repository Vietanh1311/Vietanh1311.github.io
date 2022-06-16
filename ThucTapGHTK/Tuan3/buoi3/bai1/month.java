package buoi3.bai1;

public enum month {
    
    January("30 Ngày"),February("28 Ngày"),March("29 Ngày"),April("30 Ngày"),May("31 Ngày"),June("30 Ngày"),July("30 Ngày"),August("31 Ngày"),September("30 Ngày"),
    October("30 Ngày"),November("31 Ngày"),December("31 Ngày");
    private String NumberOfDays;

    private month(String numberOfDays) {
        NumberOfDays = numberOfDays;
    }

    public String getNumberOfDays() {
        return NumberOfDays;
    }

    public void setNumberOfDays(String numberOfDays) {
        NumberOfDays = numberOfDays;
    }
    
    
}
