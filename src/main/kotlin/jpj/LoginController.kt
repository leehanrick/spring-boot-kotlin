package jpj

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class LoginController(private val repository: CustomerRepository) {

    @PostMapping("/login")
    fun loginService(@RequestBody customer: Customer): Boolean {
        val username = customer.username
        val password = customer.password!!
        val cust = repository.findByUsername(username!!)
        return cust.password == password
    }

}