document.addEventListener('DOMContentLoaded', function() {
    var letterA = document.getElementById('letter-a');
    var wordContainer = document.getElementById('word-container');
    var wordText = document.getElementById('word-text');

    // Воспроизведение звука буквы при загрузке
    var letterAudio = new Audio('assets/audio/letter-a.mp3');
    letterAudio.play();

    // Анимация буквы
    letterA.classList.add('animate-letter');

    // Обработка клика по букве
    letterA.addEventListener('click', function() {
        wordContainer.classList.remove('hidden');
        var wordAudio = new Audio('assets/audio/apple.mp3');
        wordAudio.play();
        wordText.textContent = 'A' + wordText.textContent;
    });
});
