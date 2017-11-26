package com.github.zcmgyu.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;

//@Entity
//public class Role implements GrantedAuthority {
//
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer id;
//
//	@NotEmpty
//	private String name;
//
//	@JsonIgnore
//	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "roles")
//	private Set<User> users = new HashSet<User>();
//
//	@Override
//	public String getAuthority() {
//		return name;
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Set<User> getUsers() {
//		return users;
//	}
//
//	public void setUsers(Set<User> users) {
//		this.users = users;
//	}
//
//}

@Document(collection = "Role")
public class Role implements GrantedAuthority {
    @Id
    private String id;
    private String name;

    public Role(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return name;
    }
}