import { Injectable } from '@angular/core';
import { Faixaetaria } from '../model/faixaetaria';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FaixaetariaService {

  constructor(private http: HttpClient) { }

  listFaixaEtaria(): Observable<Faixaetaria[]> {
    const url = '/api/faixaetaria';
    // const url = 'assets/faixaetaria.json';
    return this.http.get<Faixaetaria[]>(url);
  }
}
