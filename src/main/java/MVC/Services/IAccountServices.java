package MVC.Services;

import java.util.List;

import MVC.Models.AccountModel;

public interface IAccountServices {
	boolean authenticateAccount(String username, String password);
	boolean checkDuplicateUsername(String username);
	boolean checkValidEmail(String email);
	String findRoleAccount(String username, String password);
	void registerAccount(String username, String password, String email);
	void resetPassword(String username, String email, String password);
	int findAdminId(String username);
	int findAccountId(String username);
	void delete(int MaTK);
	void edit(AccountModel account);
	void insert(AccountModel account);
	List<AccountModel> findAll();
	AccountModel findById(int accountId);
	int countAll();
	List<AccountModel> pagingAccount(int index);
	int countByAccountNameSearch(String txtSearch);
	List<AccountModel> searchByAccountName(String txtSearch, int index, int pageSize);
}
