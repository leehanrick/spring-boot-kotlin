package jpj

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Customer(
        @Id @GeneratedValue
        val id: Long = -1,
        val firstName: String? = null,
        val lastName: String? = null,
        val email: String? = null,
        @Column(unique = true)
        val username: String? = null,
        @Column(length = 60)
        val password: String? = null,
        val enabled: Boolean = true,
        val isUsing2FA: Boolean = false,
        val secret: String? = null
//		@ManyToMany(fetch = FetchType.EAGER)
//		@JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
//		val roles: Collection<Role>
)