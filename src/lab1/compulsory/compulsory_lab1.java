package lab1.compulsory;

public class compulsory_lab1 {
    public static void main(String[] args) {
       String[] vector={"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int i;
        for(i=0; i< vector.length; i++){

            System.out.println("sirul este " +vector[i]);

        }

        int n=(int)(Math.random() * 1_000_000);
        System.out.println("nr randomizat este: "+n);

        n*=3;
        System.out.println("nr inmultit cu 3 este: "+n);
        n=n+0b10101;
        System.out.println("nr adunat cu nr binar 10101 este: "+n);
        n=n+0xFF;
        System.out.println("nr adunat cu nr hexa FF este: "+n);
        n*=6;

        int sum=0;
        while(n!=0){
            sum=sum+n%10;
            n/=10;
        }
        int sumf=0,ok1=0,ok2=0;
        do{
            if(sumf==0 && sum>=10){
                while(sum!=0){
                sumf=sumf+sum%10;
                sum=sum/10;}
            }

            if(sum==0 && sumf>=10){
                while(sumf!=0){
                sum=sum+sumf%10;
                sumf/=10;}
            }

            if(sum<10 && sumf==0)
                ok1=1;
            if(sumf<10 && sum==0)
                ok2=1;
            break;
        } while(ok1==0 && ok2==0);


        if(ok1==1)
            System.out.println("suma cifrelor<10 este: " +sum);
        if(ok2==1)
            System.out.println("suma cifrelor<10 este: " +sumf);
        if(ok1==1)
        System.out.println("Willy-nilly, this semester I will learn " + vector[sum]);
        if(ok2==1)
            System.out.println("Willy-nilly, this semester I will learn " + vector[sumf]);


    }}
