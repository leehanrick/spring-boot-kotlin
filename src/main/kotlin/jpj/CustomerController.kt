package jpj

import org.springframework.web.bind.annotation.*



@RestController
class CustomerController(private val repository: CustomerRepository) {

    @GetMapping("/customers")
    fun findAll() = repository.findAll()

    @GetMapping("/customers/{lastName}")
    fun findByLastName(@PathVariable lastName: String) = repository.findByLastName(lastName)

    @PostMapping
    fun addCustomer(@RequestBody customer: Customer) = repository.save(customer)

    @PutMapping("/{id}")
    fun updateCustomer(@PathVariable id: Long, @RequestBody customer: Customer) {
        assert(customer.id == id)
        repository.save(customer)
    }

    @DeleteMapping("/{id}")
    fun removeCustomer(@PathVariable id: Long) = repository.deleteById(id)

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long) = repository.findById(id)
}