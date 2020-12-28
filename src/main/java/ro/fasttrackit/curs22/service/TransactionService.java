package ro.fasttrackit.curs22.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.curs22.TransactionRepository;
import ro.fasttrackit.curs22.model.Transaction;

import java.util.List;

@Service
public class TransactionService {
    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public List<Transaction> getAll() {
        return repository.findAll();
    }
}
