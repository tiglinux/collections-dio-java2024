package list.OperacoesBasicas;

/**
 * @author Tiago Santos
 */

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

	private List<Tarefa> taskList; 			

	public ListaTarefas() {
		this.taskList = new ArrayList<>();
	}

	public void addTask(String description) {
		taskList.add(new Tarefa(description));
	}

	public void removeTask(String description) {
		List<Tarefa> tasksToRemove = new ArrayList<Tarefa>();

		for (Tarefa t : taskList) {
			if (t.getDescricao().equalsIgnoreCase(description)) {
				tasksToRemove.add(t);
			}
		}
		taskList.removeAll(tasksToRemove);
	}

	public int getTotalNumberTask() {
		return taskList.size();
	}

	public void getTasksDescriptions() {
		System.out.println(taskList);
	}

	public static void main(String[] args) {
		ListaTarefas listaTarefa = new ListaTarefas();
		listaTarefa.addTask("Tarefa1");
		listaTarefa.getTasksDescriptions();

		listaTarefa.addTask("Tarefa2");
		listaTarefa.getTasksDescriptions();

		listaTarefa.removeTask("Tarefa1");
		listaTarefa.getTasksDescriptions();
	}
}
