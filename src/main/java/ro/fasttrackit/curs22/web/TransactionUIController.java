package ro.fasttrackit.curs22.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.fasttrackit.curs22.service.TransactionService;

@Controller
@RequestMapping("transactions")
public class TransactionUIController {
    private final TransactionService transactionService;

    public TransactionUIController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    String getTransactionsPage(Model pageModel) {
        pageModel.addAttribute("message", "From backend");
        pageModel.addAttribute("transactions", transactionService.getAll());
        return "transactions";
    }
}
