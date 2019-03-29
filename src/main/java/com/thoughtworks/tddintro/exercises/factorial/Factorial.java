package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial
{
    public Integer compute(int i)
    {
        int factor;
        int resultado = 1;

        if (i < 0){
            throw new IllegalArgumentException();
        }

        else {
            if (i>1)
            {
                for(factor=1; factor<=i; factor++)
                {
                    resultado = resultado * factor;
                }
            }

            return resultado;
        }
    }
}
