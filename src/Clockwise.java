/**
 * 顺时针打印一个矩阵
 */
public class Clockwise {
    public static void main(String arg[]){
        int[][] num = new int[100][100];
        int sides = 4;//边长
        int count = 1;//步长
        //构造步长为1的矩阵
        for(int i = 0;i<sides;i++){
            for (int j = 0; j < sides; j++) {
                num[i][j] = count++;
            }
        }
        output(num,0,sides-1);
    }

    /**
     *
     * @param num   处理的数组
     * @param start 开始位置
     * @param sides   边长
     */
    private static void output(int[][] num, int start, int sides) {
        //出口
        if (start >= sides || sides <= 0) {
            return;
        }
        //从左到右方向
        for(int i=start;i<=sides;i++) {
            System.out.print(num[start][i]+",");
        }
        //从上到下方向
        for(int i=start+1;i<=sides;i++) {
            System.out.print(num[i][sides]+",");
        }
        //从右到左方向
        for (int i=sides-1;i>=start;i--) {
            System.out.print(num[sides][i]+",");
        }
        //从下到上方向
        for (int i=sides-1;i>=start+1;i--) {
            System.out.print(num[i][start]+",");
        }

        output(num,start+1,sides-1);

    }
}


