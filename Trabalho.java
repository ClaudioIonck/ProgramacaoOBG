public class Trabalho {

    public static void main(String[] args) {

        int[][] matriz = { {2,3},{4,5} };

        int[][] rotation_90 = new int[2][2];
        int[][] rotation_180 = new int[2][2];
        int[][] rotation_270 = new int[2][2];

        mostrar(matriz);

        rotacionar_90_graus(matriz,rotation_90);
        System.out.println();
        mostrar(rotation_90);

        rotacionar_180_graus(matriz,rotation_180);
        System.out.println();
        mostrar(rotation_180);

        rotacionar_270_graus(matriz,rotation_270);
        System.out.println();
        mostrar(rotation_270);

        int[][] aux=new int[2][2];

        rotacionar_90_graus(rotation_270,aux);
        System.out.println();
        mostrar(aux);

    }
    public static void rotacionar_90_graus(int[][] a,int[][] b){
        int z=1;
        for(int i=0;i<a.length;i++){
            for(int j=0; j<a[i].length ;j++){
                b[i][j]=a[j][z];
            }
            z--;
        }
    }

    public static void rotacionar_180_graus(int[][] a,int[][] b){
        int z=1;
        for(int i=0;i<a.length;i++){
            int u=1;
            for(int j=0; j<a[i].length ;j++){
                b[i][j]=a[z][u];
                u--;
            }
            z--;
        }
    }

    public static void rotacionar_270_graus(int [][] a,int[][] b){
        for(int i=0;i<a.length;i++){
            for(int j=0,u=1; j<a[i].length; j++,u--){
                b[i][j]=a[u][i];
            }
        }
    }
    public static void mostrar(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length ;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

}
