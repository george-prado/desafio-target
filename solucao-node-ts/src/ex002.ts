import * as readline from 'readline';

class ExerciseTwo {
  static showAnswer() {
    const rl = readline.createInterface({
      input: process.stdin,
      output: process.stdout
    });

    rl.question("Digite um número para verificar se pertence à sequência de Fibonacci: ", (userInput) => {
      rl.close();

      if (userInput !== null) {
        const numEntry = parseInt(userInput);

        const fibonacci = this.generateFibonacci(numEntry);

        console.log(`${numEntry} ${(this.isInFibonacci(numEntry, fibonacci) ? "está" : "NÃO está")} na sequência de Fibonacci.`);
      } else {
        console.log("Entrada inválida.");
      }
    });
  }

  static generateFibonacci(numEntry: number): number[] {
    let fibonacci: number[] = [0, 1];

    while (fibonacci.slice(-1)[0] < numEntry) {
      const nextTerm = fibonacci.slice(-1)[0] + fibonacci.slice(-2, -1)[0];
      fibonacci.push(nextTerm);
    }

    return fibonacci;
  }

  static isInFibonacci(num: number, fibonacci: number[]): boolean {
    return fibonacci.includes(num);
  }
}

export default ExerciseTwo;