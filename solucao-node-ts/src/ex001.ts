class ExerciseOne {
  static showAnswer() {
    const indice = 13;
    let soma = 0;
    let k = 0;

    while (k < indice) {
      k += 1;
      soma += k;
    }

    console.log(soma);
  }
}

export default ExerciseOne;