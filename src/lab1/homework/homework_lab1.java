package lab1.homework;

public class homework_lab1 {

    public static void main(String[] args) {
        long start = System.nanoTime();
    /*Scanner sc = new Scanner(System.in);
        System.out.println("introduceti nr de linii: " );
        int linie = sc.nextInt();
        System.out.println("introduceti nr de coloane: ");
        int coloana = sc.nextInt();

        int matrix[][] = new int[linie][coloana];
        System.out.println("introduceti valorile matricei ");

        for(int i=0; i<linie; i++)
            for(int j=0; j<coloana; j++)
                matrix[i][j] = sc.nextInt();

        for(int i=0; i<linie; i++){
            for(int j=0; j<coloana; j++){
                System.out.print(matrix[i][j]+"\t");}
                System.out.println();  */

    //Scanner sc = new Scanner(System.in);
    //System.out.println("introduceti numarul: " );
    //int m = sc.nextInt();

    String s =null;
        try{
            s=args[0];
            System.out.println(s);
            int m=Integer.parseInt(s);
        }catch(Exception e){
           System.out.println("eroare");
        }

        int m=Integer.parseInt(s);


        int matrix[][] = new int[m][m];
        for(int i=0; i<m; i++)
            for(int j=0; j<m; j++){
                if(i==j){
                matrix[i][j]=1;}
                else
                    if(i==0 && j>0){
                        matrix[i][j]=j+1;}
                        if(i>=1){
                            if(matrix[i-1][j] == 1){
                                matrix[i][j] = m;} else
                                    matrix[i][j]=matrix[i-1][j]-1;}
            }
        if(m<30000){
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+"\t");}
            System.out.println();}

            for (int i = 0; i < m; i++) {
                int k = 0;
                for (int j = 0; j < m; j++)
                    k = k * 10 + matrix[i][j];

                System.out.println("line " + i + ": " + Integer.toString(k) +" ");
            }

            for (int j = 0; j <m; j++) {
                int k = 0;
                for (int i = 0; i <m; i++)
                    k = k * 10 + matrix[i][j];
                System.out.println("coloana " + j + ": " +Integer.toString(k) + " ");
            }} else{
            long end = System.nanoTime();
        long timp = end - start;
        System.out.println(+timp);}


}}

