public class Task4 {
    public static void main(String[] args) {

        System.out.print("\033[H\033[J");
        String str = "1? + 1? = 33";
        String [] arr = str.split(" ");
        String q = arr[0];
        String w = arr[2];
        String z = arr[arr.length - 1];
        boolean flag = true;
        for (int i = 0; i < 10; i++) {
           int qNum = Integer.parseInt(q.replace("?", Integer.toString(i)));
            for (int j =0; j < 10; j++) {
                int wNum = Integer.parseInt(w.replace("?", Integer.toString(j)));
                for (int k = 0; k < 10; k++) {
                    int zNum = Integer.parseInt(z.replace("?", Integer.toString(k)));
                    if (qNum + wNum == zNum) {
                        System.out.printf("Решение уравнения %s => %d + %d = %d\n", 
                        str, qNum, wNum, zNum);
                        flag = false;
                        break;
                    }
                }
                if (flag == false) break;
            }
            if (flag == false) break;
        } 
        if (flag) System.out.println("Решений нет!");
    }
}