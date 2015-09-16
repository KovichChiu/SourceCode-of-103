public class twst011{
     public static void main(String[] args){
         int[] tmp1=new int[4];
         int[] tmp={1,2,3,4};//<---這裡自己改
         System.out.println("{}");
         work(tmp,0,tmp1,0);
     }
     public static void work(int[] tmp,int a,int[] tmp1,int b){
         while(a>=0){
             int c=0;
             if(a-1>=0){
                 c=a-1;
             }
             if(tmp1[c]==tmp[tmp.length-1]){
                 work(tmp,a-2,tmp1,1);
             }else{
                 if(b==1){
                      for(int i=0;i<tmp.length;i++){
                          if(tmp1[a]==tmp[i]){
                              tmp1[a]=tmp[i+1];
                              break;
                          }
                      }
                 }else{
                     if(a-1<0){
                         tmp1[a]=tmp[0];
                     }else{
                         for(int i=0;i<tmp.length;i++){
                             if(tmp[i]==tmp1[a-1]){
                                 tmp1[a]=tmp[i+1];
                                 break;
                             }
                         }
                     }
                 }
                 String str="";
                 for(int i=0;i<a;i++){
                     str+=tmp1[i]+",";
                 }
                 System.out.println("{"+str+tmp1[a]+"}");
                 work(tmp,a+1,tmp1,0);
             }
         }
     }
 }