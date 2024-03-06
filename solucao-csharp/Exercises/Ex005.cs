namespace desafio_target.Exercises
{
    internal class ExerciseFive
    {
        public static void ShowAnswer()
        {
            Console.Write("Digite uma palavra: ");
            string? wordInput = Console.ReadLine();

            if (!string.IsNullOrEmpty(wordInput))
            {
                Console.WriteLine($"Palavra invertida: {Inverter(wordInput)}");
            }
            else
            {
                Console.WriteLine("Por favor insira uma string válida.");
            }
        }

        static string Inverter(string word)
        {
            char[] letras = word.ToCharArray();
            int length = letras.Length;

            for (int i = 0, j = length - 1; i < j; i++, j--)
            {
                char temp = letras[i];
                letras[i] = letras[j];
                letras[j] = temp;
            }

            return new string(letras);
        }
    }

}
