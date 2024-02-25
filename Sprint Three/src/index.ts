document.addEventListener('DOMContentLoaded', () => {
  const taskForm = document.getElementById('task-form') as HTMLFormElement;
  const taskList = document.getElementById('task-list') as HTMLUListElement;

  taskForm.addEventListener('submit', (e: Event) => {
      e.preventDefault();
      addNote();
  });

  function addNote() {
      const newNoteInput = document.getElementById('new-task') as HTMLInputElement;
      const noteText = newNoteInput.value.trim();

      if (noteText !== '') {
          const listItem = document.createElement('li');
          listItem.innerHTML = `
              <span>${noteText}</span>
              <button class="remove-btn">Remove</button>
          `;
          taskList.appendChild(listItem);
          newNoteInput.value = '';

          const removeButton = listItem.querySelector('.remove-btn') as HTMLButtonElement;
          removeButton.addEventListener('click', () => removeNote(listItem));
      }
  }

  function removeNote(listItem: HTMLLIElement) {
      taskList.removeChild(listItem);
  }
});