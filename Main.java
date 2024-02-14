import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Input.txt");
        BufferedReader br = new BufferedReader(fr);


        FileWriter fw = new FileWriter("Output.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        String read_index = br.readLine();
        int first_index = Integer.parseInt(read_index);

        for (int i = 1; i <= first_index; i++) {
            String line = br.readLine();
            int num = Integer.parseInt(line);

            String result = isPrime(num);
            bw.write(result + "\n");
        }
        br.close();
        bw.close();
    }

    public static String isPrime(int val) {
        if (val < 2)
            return "Not Prime";

        for (int i = 2; i <= Math.sqrt(val); i++)
            if (val % i == 0)
                return "Not Prime";

        return "Prime";
    }
}
