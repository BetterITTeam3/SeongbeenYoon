import java.util.Arrays;

class solver {
    int sortk(int[] arr,int k) {
        int min = 100;
        int num=0;
        for (int i = 0; i < k; i++) {
            min=100;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]!=0) {
                    if (min > arr[j]) {
                        min = arr[j];
                        num = j;
                    }
                }
            }
            arr[num]=0;
        }
        return min;
    }

    int[] slicing(int[] arr, int a, int b) {
        int[] temp = new int[b - a + 1];
        for (int i = a - 1; i < b; i++) {
            temp[i - a + 1] = arr[i];
        }
        return temp;
    }

    int[] solution(int[] array, int[][] commands) {
        int l;
        int i;
        int j;
        int k;
        l = commands.length;
        int[] answer = {};
        answer = new int[l];
        for (int a = 0; a < l; a++) {
            i = commands[a][0] ;
            j = commands[a][1];
            k = commands[a][2];
            int[] temp;
            temp = slicing(array, i, j);
            answer[a] = sortk(temp,k);
        }

        return answer;
    }
}
public class Soluton {
    public static void main(String args[]){
        solver s=new solver();
        int[] array= {1, 5, 2, 6, 3, 7, 4};
        int[][] commands ={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer;
        answer=s.solution(array, commands);
        System.out.print(Arrays.toString(answer));
    }
}
//Arrays util 걍쓰자...ㅋㅋㅋㅋㅋㅋ 내가 왜저랬을까~~~
//정렬 알고리즘 복습 해야겠는데..?
//근데 왜 내 계정으로 커밋이 안돼..?