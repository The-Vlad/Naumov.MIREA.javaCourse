package ru.mirea.Naumov.lab10.ex1;

import ru.mirea.Naumov.lab10.ex1.Complex;

public interface ComplexAbstractFactory {
    public Complex createComplex();
    public Complex createComplex(int real, int image);
}
