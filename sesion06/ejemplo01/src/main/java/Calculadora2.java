public class Calculadora2 {
    private CalculadoraDao calculadoraDao;

    public int suma(int a, int b){
        return a + b + calculadoraDao.findValorConstante();
    }
    public int resta(int a, int b){
        return a - b + calculadoraDao.findValorConstante();
    }
    public int multiplica(int a, int b){
        return a * b + calculadoraDao.findValorConstante();
    }
}
