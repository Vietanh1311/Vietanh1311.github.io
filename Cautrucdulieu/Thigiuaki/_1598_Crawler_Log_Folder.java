public class _1598_Crawler_Log_Folder {
    public static void main(String[] args) {
        String logs[] = { "d1/", "d2/", "./", "d3/", "../", "d31/" };
        System.out.println(minOperations(logs));
    }

    public static int minOperations(String[] logs) {
        int count = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                if (count > 0)
                    count--;
            } else if (log.equals("./")) {
                continue;
            } else {
                count++;
            }
        }
        return count;
    }
}
