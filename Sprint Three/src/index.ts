document.addEventListener('DOMContentLoaded', () => {
  const taskForm = document.getElementById('task-form') as HTMLFormElement;
  const taskList = document.getElementById('task-list') as HTMLUListElement;

  taskForm.addEventListener('submit', (e: Event) => {
      e.preventDefault();
      addTask();
  });

  function addTask() {
      const newTaskInput = document.getElementById('new-task') as HTMLInputElement;
      const taskText = newTaskInput.value.trim();

      if (taskText !== '') {
          const listItem = document.createElement('li');
          listItem.innerHTML = `
              <span>${taskText}</span>
              <button onclick="removeTask(this)">Remove</button>
          `;
          taskList.appendChild(listItem);
          newTaskInput.value = '';
      }
  }

  (window as any).removeTask = (button: HTMLButtonElement) => {
    const listItem = button.parentElement;

    if (listItem) {
        const taskList = listItem.parentElement;
        if (taskList) {
            taskList.removeChild(listItem);
        }
    }
  };
});
