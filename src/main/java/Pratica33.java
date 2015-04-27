import utfpr.ct.dainf.if62c.pratica.Matriz;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica33 {
    /**
     * Retorna a soma desta matriz com a matriz recebida como argumento.
     * @param m A matriz a ser somada
     * @return A soma das matrizes
     */
    public Matriz soma(Matriz m) {
        throw new UnsupportedOperationException("Soma de matrizes não implementada.");
    }

    /**
     * Retorna o produto desta matriz com a matriz recebida como argumento.
     * @param m A matriz a ser multiplicada
     * @return O produto das matrizes
     */
    public Matriz prod(Matriz m) {
        Matriz t = new Matriz(mat[0].length, mat.length);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                t.mat[j][i] = mat[i][j];
            }
        }
    }

    public static void main(String[] args) {
        Matriz orig = new Matriz(3, 2);
        double[][] m = orig.getMatriz();
        m[0][0] = 0.0;
        m[0][1] = 0.1;
        m[1][0] = 1.0;
        m[1][1] = 1.1;
        m[2][0] = 2.0;
        m[2][1] = 2.1;
        Matriz transp = orig.getTransposta();
        System.out.println("Matriz original: " + orig);
        System.out.println("Matriz transposta: " + transp);
        Matriz matriz1 = new Matriz(2, 2);
        double[][] n = matriz1.getMatriz();
        n[0][0] = 1;
        n[0][1] = 2;
        n[1][0] = 2;
        n[1][1] = 2;
        Matriz matriz2 = new Matriz(2, 2);
        double[][] n2 = matriz2.getMatriz();
        n2[0][0] = 1;
        n2[0][1] = 2;
        n2[1][0] = 2;
        n2[1][1] = 2;
        System.out.println("Matriz original: " + matriz1);
    }
}
