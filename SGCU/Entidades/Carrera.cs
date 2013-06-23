using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Entidades
{
    public class Carrera
    {
        string Codigo;
        string Nombre;
        Plan[] Planes;
        decimal AsistenciaMinima;
        decimal NotaMinima;
        int CantidadMaximaFinales;
        int AniosMaximoFinales;
    }
}
