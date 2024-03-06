namespace desafio_target.Exercises
{
    internal class ExerciseOne
    {
        public static void ShowAnswer()
        {
            int indice = 13;
            int soma = 0, k = 0;

            while (k < indice)
            {
                k += 1;
                soma += k;
            }

            Console.WriteLine(soma);
        }

    }
}
