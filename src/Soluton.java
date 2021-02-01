public class Soluton {
    public int[] slicing(int[] arr, int a, int b){
        int[] temp=new int[b-a+1];
        for(int i=a-1; i<b;i++){
            temp[i-a+1]=arr[i];
        }
        return temp;
    }
    public int[] solution(int[] array, int[][] commands) {
        int l;
        int i;
        int j;
        int k;
        l=commands.length;
        for(int a=0;a<l;a++){
            i=commands[a][0]-1;
            j=commands[a][1];
            k=commands[a][2];
            int[] temp;
            temp=slicing(array,i,j);



        }
        int[] answer = {};
        return answer;
    }
}
