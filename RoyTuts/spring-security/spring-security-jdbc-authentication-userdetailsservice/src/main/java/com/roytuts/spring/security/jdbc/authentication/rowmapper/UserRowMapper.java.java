public class UserRowMapper implements RowMapper<UserDetails> {

	@Override
	public UserDetails mapRow(ResultSet rs, int row) throws SQLException {
		UserDetails userDetails = new UserDetails();
		userDetails.setUsername(rs.getString("user_name"));
		userDetails.setPassword(rs.getString("user_pass"));
		userDetails.setRole(rs.getString("user_role"));

		return userDetails;
	}

}
