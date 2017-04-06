<!-- login Grid Section -->
<section id="login">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
			<h2>Login</h2>
			<hr class="star-primary">
		</div>
	</div>
	<div class="row">
		<div class="col-lg-8 col-lg-offset-2">
			<div class="row control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label for="id">ID</label>
					<input type="text" name="id" class="form-control" placeholder="ID" id="mem_id" required data-validation-required-message="Please enter your ID.">
					<p class="help-block text-danger"></p>
				</div>
			</div>
			<div class="row control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label for="password">password</label>
					<input type="password" name="password" class="form-control" placeholder="Password" id="mem_pw" required	data-validation-required-message="Please enter your Password.">
					<p class="help-block text-danger"></p>
				</div>
			</div>
			<br> 
			<div id="loginalert"></div>
				<div class="row control-group">
					<input type="button" class="btn btn-success btn-lg"	id="login_btn" value="Login">
				</div>
			</div>
		</div>
	</div>
</section>
