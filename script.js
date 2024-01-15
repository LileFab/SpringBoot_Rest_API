const axios = require('axios');

// Requête GET
axios
	.get('http://localhost:8080/equipes')
	.then(response => {
		console.log('GET Response:', response.data);

		// Requête POST avec des données JSON
		const postData = {
			// Vos données JSON ici
			nom: 'NouilleFC',
			ville: 'Saint Etienne'
		};

		axios
			.post('http://localhost:8080/equipes', postData)
			.then(postResponse => {
				console.log('POST Response:', postResponse.data);
			})
		})
  
  axios
	.get('http://localhost:8080/equipes')
	.then(response => {
console.log('GET')})
