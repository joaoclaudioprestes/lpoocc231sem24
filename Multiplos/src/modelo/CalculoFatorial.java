package modelo;

public class CalculoFatorial extends AbsPropriedades
{

    public CalculoFatorial(Integer num)
    {
        super(num);
    }

    @Override
    public void Executar()
    {
        int base = num;
        for(int i = 1; i < base; i++)
            num *= i;
        
        this.resposta = this.num.toString();
    }
    
}
