public class minusone {
    public static void main(String args[]){
        int i,pc=0,nc=0,pa=0,na=0,pt=0,nt=0;
        int[] d1={10,20,-21,-20,-1,20,39};
        int[] d2=new int[d1.length];
        for(i=0;i<d1.length;i++){
            if(d1[i]!=-1){
                d2[i] = d1[i];
            }else{
                d2[i]=d1[i];
                break;
            }
        }
        for(i=0;i<d2.length;i++){
            if(d2[i]<0){
                nc = nc + 1;
                nt += d2[i];
            }else if(d2[i]>0){
                pc += 1;
                pt += d2[i];
            }else{
                continue;
            }
        }
        pa = pt /pc;
        na = nt /nc;

        System.out.println("sum of +ve is  "+pt);
        System.out.println("sum of -ve is  "+nt);
        System.out.println("avg of +ve is  "+pa);
        System.out.println("avg of -ve is  "+na);

    }
}
