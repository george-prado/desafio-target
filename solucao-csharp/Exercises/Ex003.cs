namespace desafio_target.Exercises
{
    internal class ExerciseThree
    {
        public static void ShowAnswer()
        {
            Console.Write("A) ");
            for (int i = 1; i <= 9; i += 2)
            {
                Console.Write(i);

                if (i < 9)
                {
                    Console.Write(", ");
                }
                else
                {
                    Console.Write("\n");
                }
            }

            Console.Write("B) ");
            for (int i = 1; i <= 7; i++)
            {
                double answer = Math.Pow(2, i);

                Console.Write(answer);

                if (i < 7)
                {
                    Console.Write(", ");
                }
                else
                {
                    Console.Write("\n");
                }
            }

            Console.Write("C) ");
            for (int i = 0; i <= 7; i++)
            {
                double answer = Math.Pow(i, 2);

                Console.Write(answer);

                if (i < 7)
                {
                    Console.Write(", ");
                }
                else
                {
                    Console.Write("\n");
                }
            }

            Console.Write("D) ");
            for (int i = 2; i <= 10; i += 2)
            {
                double answer = Math.Pow(i, 2);

                Console.Write(answer);

                if (i < 10)
                {
                    Console.Write(", ");
                }
                else
                {
                    Console.Write("\n");
                }
            }

            Console.Write("E) ");
            int[] fibonacci = new int[8];
            int start = 0;
            int next = 1;

            for (int i = 0; i < 8; i++)
            {
                fibonacci[i] = start;
                int temp = next;
                next += start;
                start = temp;
            }

            Console.WriteLine(string.Join(", ", fibonacci));

            Console.Write("F) ");
            Dictionary<int, string> numerosPorExtenso = new()
            {
                {2, "Dois"},
                {10, "Dez"},
                {12, "Doze"},
                {16, "Dezesseis"},
                {17, "Dezessete"},
                {18, "Dezoito"},
                {19, "Dezenove"},
                {200, "Duzentos"}
            };

            Console.Write(string.Join(", ", numerosPorExtenso.Keys));
            Console.Write("\n");
            Console.Write(string.Join(", ", numerosPorExtenso.Values));
            Console.WriteLine();
        }
    }
}

