namespace desafio_target.Exercises
{
    internal class ExerciseTwo
    {
        public static void ShowAnswer()
        {
            Console.Write("Digite um número para verificar se pertence à sequência de Fibonacci: ");
            int numEntry = Convert.ToInt32(Console.ReadLine());

            int[] fibonacci = GenerateFibonacci(numEntry);

            Console.WriteLine($"{numEntry} {(IsInFibonacci(numEntry, fibonacci) ? "está" : "NÃO está")} na sequência de Fibonacci.");
        }

        public static int[] GenerateFibonacci(int numEntry)
        {
            int[] fibonacci = new int[2] { 0, 1 };

            while (fibonacci[^1] < numEntry)
            {
                int nextTerm = fibonacci[^1] + fibonacci[^2];
                Array.Resize(ref fibonacci, fibonacci.Length + 1);
                fibonacci[^1] = nextTerm;
            }

            return fibonacci;
        }

        public static bool IsInFibonacci(int num, int[] fibonacci)
        {
            foreach (int fibo in fibonacci)
            {
                if (fibo == num) return true;
            }

            return false;
        }
    }
}
