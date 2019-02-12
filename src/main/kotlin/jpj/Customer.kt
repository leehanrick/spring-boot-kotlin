package jpj

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Customer(
        @Id @GeneratedValue
        val id: Long = -1,
        val firstName: String,
        val lastName: String,
        val email: String,
        @Column(length = 60)
        val password: String,
        val enabled: Boolean = true,
        val isUsing2FA: Boolean = false,
        val secret: String
//		@ManyToMany(fetch = FetchType.EAGER)
//		@JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
//		val roles: Collection<Role>
)