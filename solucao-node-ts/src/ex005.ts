class ExerciseFive {
  static showAnswer(): void {
    const prompt = require('prompt-sync')();
    
    console.log("Digite uma palavra: ");
    const wordInput: string = prompt();

    if (wordInput !== undefined && wordInput.trim() !== '') {
      console.log(`Palavra invertida: ${this.inverter(wordInput)}`);
    } else {
      console.log("Por favor, insira uma string válida.");
    }
  }

  static inverter(word: string): string {
    const letras: string[] = word.split('');
    const length: number = letras.length;

    for (let i: number = 0, j: number = length - 1; i < j; i++, j--) {
      const temp: string = letras[i];
      letras[i] = letras[j];
      letras[j] = temp;
    }

    return letras.join('');
  }
}

export default ExerciseFive;