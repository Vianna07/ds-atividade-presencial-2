package br.com.vianna.task.manager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vianna.task.manager.models.Tarefa;
import br.com.vianna.task.manager.repositories.TarefaRepository;

@Service
public class TarefaService {
	@Autowired
	private TarefaRepository tarefaRepository;
	public Tarefa save(Tarefa tarefa) {
		return tarefaRepository.save(tarefa);
	}
}
