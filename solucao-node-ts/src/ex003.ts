class ExerciseThree {
    static showAnswer() {
      // A
      console.log("A) " + Array.from({ length: 5 }, (_, i) => 2 * i + 1).join(", "));
  
      // B
      console.log("B) " + Array.from({ length: 7 }, (_, i) => Math.pow(2, i + 1)).join(", "));
  
      // C
      console.log("C) " + Array.from({ length: 8 }, (_, i) => Math.pow(i, 2)).join(", "));
  
      // D
      console.log("D) " + Array.from({ length: 5 }, (_, i) => Math.pow(2 * (i + 1), 2)).join(", "));
  
      // E
      const fibonacci = this.generateFibonacci(8);
      console.log("E) " + fibonacci.join(", "));
  
      // F
      const numerosPorExtenso = {
        2: "Dois",
        10: "Dez",
        12: "Doze",
        16: "Dezesseis",
        17: "Dezessete",
        18: "Dezoito",
        19: "Dezenove",
        200: "Duzentos",
      };
  
      console.log("F) " + Object.keys(numerosPorExtenso).join(", "));
      console.log(Object.values(numerosPorExtenso).join(", "));
    }
  
    static generateFibonacci(length) {
      let fibonacci = [0, 1];
  
      while (fibonacci.length < length) {
        const nextTerm = fibonacci.slice(-1)[0] + fibonacci.slice(-2, -1)[0];
        fibonacci.push(nextTerm);
      }
  
      return fibonacci;
    }
  }
  
  export default ExerciseThree;